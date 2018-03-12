package com.stevedunstan.packing;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FitterTest {

    protected Fitter fitter;

    @Before
    public void init() {
        fitter = new SearchFitter();
    }

    @Test
    public void fitTest21() {
        int[] result = new int[3];
        fitter.fit(21, result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest35() {
        int[] result = new int[3];
        fitter.fit(35, result);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    public void fitTest20() {
        int[] result = new int[3];
        fitter.fit(20, result);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void fitTest80() {
        int[] result = new int[3];
        fitter.fit(80, result);
        assertEquals(4, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

    @Test
    public void fitTest41() {
        int[] result = new int[3];
        fitter.fit(41, result);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest81() {
        int[] result = new int[3];
        fitter.fit(81, result);
        assertEquals(3, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void fitTest44() {
        int[] result = new int[3];
        fitter.fit(44, result);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
    }

    @Test
    public void fitTest111() {
        int[] result = new int[3];
        fitter.fit(111, result);
        System.out.println("111: " + Arrays.toString(result));
        assertEquals(3, result[0]); // 3 60  |  3 60
        assertEquals(5, result[1]); // 1  9  |  5 45
        assertEquals(1, result[2]); // 7 42  |  1  6
    }

    @Test
    public void fitTest101() {
        int[] result = new int[3];
        fitter.fit(101, result);
        System.out.println("101: " + Arrays.toString(result));
        assertEquals(4, result[0]); // 80
        assertEquals(1, result[1]); //  9
        assertEquals(2, result[2]); // 12
    }

    @Test
    public void fitTest18() {
        int[] result = new int[3];
        fitter.fit(18, result);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
        assertEquals(0, result[2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal1() {
        int[] result = new int[3];
        fitter.fit(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal7() {
        int[] result = new int[3];
        fitter.fit(7, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal10() {
        int[] result = new int[3];
        fitter.fit(10, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fitTestIllegal22() {
        int[] result = new int[3];
        fitter.fit(22, result);
    }
}