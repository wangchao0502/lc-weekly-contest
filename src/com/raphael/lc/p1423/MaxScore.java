package com.raphael.lc.p1423;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-02-06 20:23:49
 */
class MaxScore {
    /**
     * Description for MaxScore:
     * 可获得的最大点数
     */
    public int maxScore(int[] cardPoints, int k) {
        // code
        int n = cardPoints.length;
        int windowSize = n - k;
        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += cardPoints[i];
        }
        int minSum = sum;
        for (int i = windowSize; i < n; i++) {
            sum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, sum);
        }
        return Arrays.stream(cardPoints).sum() - minSum;
    }
}
