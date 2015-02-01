package com.google.gwt.emultest.java.time;

import java.time.LocalDate;

import com.google.gwt.junit.client.GWTTestCase;

public class LocalDateGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.google.gwt.emultest.JavaTimeTestSuite";
    }

    public void testToString() {
        assertEquals("TODO", LocalDate.now().toString());
    }
}
