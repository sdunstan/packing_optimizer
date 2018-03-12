package com.stevedunstan.packing;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchFitterTest {

    @Test
    public void test20() {
        SearchFitter fitter = new SearchFitter();

        int[] result = new int[3];
        fitter.fit(20, result);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void test49() {
        SearchFitter fitter = new SearchFitter();

        int[] result = new int[3];
        fitter.fit(49, result);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void test21() {
        SearchFitter fitter = new SearchFitter();

        int[] result = new int[3];
        fitter.fit(21, result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test22() {
        SearchFitter fitter = new SearchFitter();

        int[] result = new int[3];
        fitter.fit(22, result);
    }

}