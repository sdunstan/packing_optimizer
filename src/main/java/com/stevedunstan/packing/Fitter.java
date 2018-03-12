package com.stevedunstan.packing;

public class Fitter {

    public void fit(int count, int[] counts) {
        if (count == 0) return;
        if (count < 0) throw new IllegalArgumentException("Count is illegal.");

        int size = adjustCounts(count, counts);
        fit(count-size, counts);
        combineLCM(counts);
    }

    /**
     * One iteration of reducing the counts.
     * @param count
     * @param counts
     * @return amount to reduce the total count by (may be negative)
     */
    protected int adjustCounts(int count, int[] counts) {
        int size;
        if (count >= 20) {
            size = 20;
            counts[0] = counts[0] + 1;
        }
        else if (count >= 9) {
            size = 9;
            counts[1] = counts[1] + 1;
        }
        else if (count >= 6) {
            size = 6;
            counts[2] = counts[2] + 1;
        }
        else if (counts[1] > 0) {
            counts[1] = counts[1] - 1; // borrow from 9's
            counts[2] = counts[2] + 1;
            size = -3; // 6 - 9;
        }
        else if (counts[0] > 0) {
            counts[0] = counts[0] - 1; // borrow from 20's
            counts[1] = counts[1] + 2;
            size = -2; // 18 - 20;
        }
        else {
            throw new IllegalArgumentException("Count is illegal.");
        }
        return size;
    }

    protected void combineLCM(int[] counts) {
        // LCM of 6 and 9 is 18
        if (counts[2] > 3) {
//        if (counts[2] == 3) {
            counts[2] = 0;
            counts[1] = counts[1] + 2;
        }

        // LCM of 9 and 20 is 180
        if (counts[1] == 20) {
            counts[1] = 0;
            counts[0] = counts[0] + 9;
        }
    }

    protected int quantity(int[] result) {
        if (result == null || result.length != 3) return 0;
        return result[0] * 20 + result[1] * 9 + result[2] * 6;
    }

}
