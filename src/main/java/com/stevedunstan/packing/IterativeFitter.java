package com.stevedunstan.packing;

public class IterativeFitter extends Fitter {

    @Override
    public void fit(int count, int[] counts) {
        while (count > 0) {
            int size = adjustCounts(count, counts);
            count = count - size;
        }
        combineLCM(counts);
    }

}
