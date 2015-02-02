package com.google.gwt.time.temporal;

import java.util.Locale;
import java.util.Map;

import com.google.gwt.time.format.ResolverStyle;

public interface TemporalField {
    TemporalUnit getBaseUnit();
    TemporalUnit getRangeUnit();
    ValueRange range();
    boolean isDateBased();
    boolean isTimeBased();
    boolean isSupportedBy(TemporalAccessor temporal);
    ValueRange rangeRefinedBy(TemporalAccessor temporal);
    long getFrom(TemporalAccessor temporal);
    <R extends Temporal> R adjustInto(R temporal, long newValue);

    TemporalAccessor resolve(
                    Map<TemporalField, Long> fieldValues,
                    TemporalAccessor partialTemporal,
                    ResolverStyle resolverStyle);

    /**
     * Gets a descriptive name for the field.
     * <p>
     * The should be of the format 'BaseOfRange', such as 'MonthOfYear',
     * unless the field has a range of {@code FOREVER}, when only
     * the base unit is mentioned, such as 'Year' or 'Era'.
     *
     * @return the name of the field, not null
     */
    @Override
    String toString();

    //TODO default methods
    String getDisplayName(Locale locale);
    
}
