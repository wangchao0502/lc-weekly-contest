package com.raphael.lc.weekly240.p5750;

/**
 * @author Raphael
 * @date 2021-05-09 10:47:16
 */
class MaximumPopulation {
    /**
     * Description for MaximumPopulation:
     * 人口最多的年份
     */
    public int maximumPopulation(int[][] logs) {
        // code
        int begin = 1950;
        int[] count = new int[101];
        for (int[] log : logs) {
            count[log[0] - begin]++;
            count[log[1] - begin]--;

        }

        int population = 0;
        int maxPopulation = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            population += count[i];
            if (population > maxPopulation) {
                ans = i;
                maxPopulation = population;
            }
        }

        return ans + begin;
    }
}
