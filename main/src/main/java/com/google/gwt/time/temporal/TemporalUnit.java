package com.google.gwt.time.temporal;

import com.google.gwt.time.Duration;

public interface TemporalUnit {
    Duration getDuration();

    boolean isDurationEstimated();

    boolean isDateBased();

    boolean isTimeBased();

    <R extends Temporal> R addTo(R temporal, long amount);

    long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive);

    //-----------------------------------------------------------------------

    /**
     * Gets a descriptive name for the unit.
     * <p/>
     * This should be in the plural and upper-first camel case, such as 'Days' or 'Minutes'.
     *
     * @return the name of this unit, not null
     */
    @Override
    String toString();

    //TODO default methods
    boolean isSupportedBy(Temporal temporal);
}
