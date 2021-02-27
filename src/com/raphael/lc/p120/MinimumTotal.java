package com.raphael.lc.p120;

import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-27 17:51:44
 */
class MinimumTotal {
    /**
     * Description for MinimumTotal:
     * 三角形最小路径和
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        // code
        int n = triangle.size();
        // 到在第i层第j个点的最短路径
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);

        // 由于每层只依赖上一层的数据，可以做空间优化，从n^2 -> n
        for (int i = 1; i < n; i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                int x = row.get(j);
                if (j > 0 && j < i) {
                    dp[i][j] = Math.min(dp[i - 1][j] + x, dp[i - 1][j - 1] + x);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + x;
                } else {
                    // j == i
                    dp[i][j] = dp[i - 1][j - 1] + x;
                }
            }
        }

        int ans = dp[n - 1][0];
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, dp[n - 1][i]);
        }

        return ans;
    }
}
