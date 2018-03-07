package com.stevedunstan.packing;

public class Fitter {

    public void fit(int count, int[] counts) {
        if (count == 0) return;
        if (count < 0) throw new IllegalArgumentException("Count is illegal.");


        int size = 0;
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
        combineLCD(counts);

        fit(count-size, counts);
    }

    private void combineLCD(int[] counts) {
        if (counts[2] == 6) {
            counts[2] = 0;
            counts[1] = counts[1] + 4;
        }
    }

}
