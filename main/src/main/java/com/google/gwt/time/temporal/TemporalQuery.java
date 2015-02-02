package com.google.gwt.time.temporal;

public interface TemporalQuery<R> {
    R queryFrom(TemporalAccessor temporal);
}
