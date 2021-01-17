package com.raphael.lc.weekly224.p5655;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-17 10:55:59
 */
class LargestSubmatrix {
    /**
     * Description for LargestSubmatrix:
     * 二维矩阵按列重排，返回最大全为1的子矩阵面积
     */
    public int largestSubmatrix(int[][] matrix) {
        // code
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    // 记录向上连续1的个数
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        for (int[] ints : matrix) {
            Arrays.sort(ints);
            int height = Integer.MAX_VALUE;
            for (int j = m - 1; j >= 0; j--) {
                height = Math.min(height, ints[j]);
                ans = Math.max(ans, height * (m - j));
            }
        }
        return ans;
    }
}
