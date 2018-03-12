package com.stevedunstan.packing;

public class BruteForceFitter implements Fitter {
    static int expansionCount = 0;

    public void fit(int count, int[] counts) {
        expansionCount = 0;
        for (int k = 0; k <= count/6; k++) {
            for (int j = 0; j <= count/9; j++) {
                for (int i = 0; i <= count/20; i++) {
                    expansionCount++;
                    int[] candidate = new int[3];
                    candidate[0] = i;
                    candidate[1] = j;
                    candidate[2] = k;
                    if (count == quantity(candidate)) {
                        if (size(candidate) < size(counts)) {
                            counts[0] = candidate[0];
                            counts[1] = candidate[1];
                            counts[2] = candidate[2];
                        }
                    }
                }
            }
        }
        System.out.println("Performed " + expansionCount + " expansions.");
        if (size(counts) == Integer.MAX_VALUE)
            throw new IllegalArgumentException("Could not find a solution");
    }

    private int size(int[] counts) {
        int total = counts[0] + counts[1] + counts[2];
        if (total == 0)
            return Integer.MAX_VALUE;
        else
            return total;
    }

    private int quantity(int[] result) {
        if (result == null || result.length != 3) return 0;
        return result[0] * 20 + result[1] * 9 + result[2] * 6;
    }
}
