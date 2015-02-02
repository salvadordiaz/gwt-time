package com.google.gwt.time.temporal;

public interface Temporal extends TemporalAccessor {

    boolean isSupported(TemporalUnit unit);

    Temporal with(TemporalField field, long newValue);

    Temporal plus(long amountToAdd, TemporalUnit unit);

    long until(Temporal endExclusive, TemporalUnit unit);

    //TODO: default methods
    Temporal with(TemporalAdjuster adjuster);

    Temporal plus(TemporalAmount amount);

    Temporal minus(TemporalAmount amount);

    Temporal minus(long amountToSubtract, TemporalUnit unit);
}
