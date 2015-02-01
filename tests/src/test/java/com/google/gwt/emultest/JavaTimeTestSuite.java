package com.google.gwt.emultest;

import com.google.gwt.emultest.java.time.LocalDateGwtTest;
import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;
import junit.framework.TestCase;

public class JavaTimeTestSuite extends TestCase {

    public static Test suite() {
        GWTTestSuite suite = new GWTTestSuite("Tests for com.google.emul.java.time");
        suite.addTestSuite(LocalDateGwtTest.class);
        return suite;
    }
}
