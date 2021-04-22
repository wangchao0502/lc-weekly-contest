package com.raphael.lc.p363;

import java.util.TreeSet;

/**
 * @author Raphael
 * @date 2021-04-22 11:10:41
 */
class MaxSumSubmatrix {
    /**
     * Description for MaxSumSubmatrix:
     * 矩形区域不超过k的最大数值和
     */
    public int maxSumSubmatrix(int[][] matrix, int k) {
        // code
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int[] sum = new int[n];
            for (int j = i; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    sum[l] += matrix[j][l];
                }
                TreeSet<Integer> sumSet = new TreeSet<>();
                sumSet.add(0);
                int s = 0;
                for (int v : sum) {
                    s += v;
                    Integer ceil = sumSet.ceiling(s - k);
                    if (ceil != null) {
                        ans = Math.max(ans, s - ceil);
                    }
                    sumSet.add(s);
                }
            }
        }
        return ans;
    }
}
