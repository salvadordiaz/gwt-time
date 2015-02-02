package com.google.gwt.time.chrono;

import com.google.gwt.time.temporal.Temporal;
import com.google.gwt.time.temporal.TemporalAdjuster;

public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>>{
    
}
