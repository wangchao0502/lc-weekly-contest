package com.raphael.lc.p1074;

/**
 * @author Raphael
 * @date 2021-05-29 11:00:37
 */
class NumSubmatrixSumTarget {
    /**
     * Description for NumSubmatrixSumTarget:
     * 元素和为目标值的子矩阵数量
     */
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        // code
        int ans = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        long[][] sum = new long[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            long lineSum = 0;
            for (int j = 1; j <= n; j++) {
                lineSum += matrix[i - 1][j - 1];
                sum[i][j] = sum[i - 1][j] + lineSum;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = i; k <= m; k++) {
                    for (int l = j; l <= n; l++) {
                        if (sum[k][l] - sum[k][j - 1] - sum[i - 1][l] + sum[i - 1][j - 1] == target) {
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
