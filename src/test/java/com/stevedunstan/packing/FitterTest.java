package com.stevedunstan.packing;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitterTest {
    @Test
    public void fitTest21() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(21, result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest35() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(35, result);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    public void fitTest20() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(20, result);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void fitTest80() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(80, result);
        assertEquals(4, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void fitTest41() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(41, result);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest81() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(81, result);
        assertEquals(3, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest111() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(111, result);
        assertEquals(3, result[0]);
        assertEquals(5, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    public void fitTest18() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(18, result);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
        assertEquals(0, result[2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal1() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal7() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(7, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal10() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(10, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal22() {
        Fitter fitter = new Fitter();
        int[] result = new int[3];
        fitter.fit(22, result);
    }
}