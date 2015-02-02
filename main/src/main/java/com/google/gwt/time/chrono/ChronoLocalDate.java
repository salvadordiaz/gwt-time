package com.google.gwt.time.chrono;

import com.google.gwt.time.LocalTime;
import com.google.gwt.time.format.DateTimeFormatter;
import com.google.gwt.time.temporal.*;

public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    Chronology getChronology();

    int lengthOfMonth();

    @Override
    long until(Temporal endExclusive, TemporalUnit unit);

    ChronoPeriod until(ChronoLocalDate endDateExclusive);

    //-----------------------------------------------------------------------
    /**
     * Checks if this date is equal to another date, including the chronology.
     * <p>
     * Compares this date with another ensuring that the date and chronology are the same.
     * <p>
     * To compare the dates of two {@code TemporalAccessor} instances, including dates
     * in two different chronologies, use {@link ChronoField#EPOCH_DAY} as a comparator.
     *
     * @param obj  the object to check, null returns false
     * @return true if this is equal to the other date
     */
    @Override
    boolean equals(Object obj);

    /**
     * A hash code for this date.
     *
     * @return a suitable hash code
     */
    @Override
    int hashCode();

    //-----------------------------------------------------------------------
    /**
     * Outputs this date as a {@code String}.
     * <p>
     * The output will include the full local date.
     *
     * @return the formatted date, not null
     */
    @Override
    String toString();

    //TODO: default methods
    ChronoLocalDate from(TemporalAccessor temporal);

    Era getEra();

    boolean isLeapYear();

    int lengthOfYear();

    @Override
    boolean isSupported(TemporalField field);

    @Override
    boolean isSupported(TemporalUnit unit);

    @Override
    ChronoLocalDate with(TemporalAdjuster adjuster);

    @Override
    ChronoLocalDate with(TemporalField field, long newValue);

    @Override
    ChronoLocalDate plus(TemporalAmount amount);

    @Override
    ChronoLocalDate plus(long amountToAdd, TemporalUnit unit);

    @Override
    ChronoLocalDate minus(TemporalAmount amount);

    @Override
    ChronoLocalDate minus(long amountToSubtract, TemporalUnit unit);

    @Override
    <R> R query(TemporalQuery<R> query);

    @Override
    Temporal adjustInto(Temporal temporal);

    String format(DateTimeFormatter formatter);

    ChronoLocalDateTime<?> atTime(LocalTime localTime);

    long toEpochDay();

    @Override
    int compareTo(ChronoLocalDate other);

    boolean isAfter(ChronoLocalDate other);

    boolean isBefore(ChronoLocalDate other);

    boolean isEqual(ChronoLocalDate other);
    
    //TODO: static methods on interfaces
    //    static Comparator<ChronoLocalDate> timeLineOrder() {
    //        return AbstractChronology.DATE_ORDER;
    //    }

}
