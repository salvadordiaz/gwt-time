package com.google.gwt.time.temporal;

public interface TemporalAccessor {

    boolean isSupported(TemporalField field);

    long getLong(TemporalField field);

    //TODO: implement default methods
    <R> R query(TemporalQuery<R> query);

    int get(TemporalField field);

    ValueRange range(TemporalField field);

}
