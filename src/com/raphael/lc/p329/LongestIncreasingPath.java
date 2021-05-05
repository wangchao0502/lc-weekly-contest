package com.raphael.lc.p329;

/**
 * @author Raphael
 * @date 2021-05-05 12:48:33
 */
class LongestIncreasingPath {
    /**
     * Description for LongestIncreasingPath:
     * 矩阵中的最长递增路径
     */

    int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        // code
        m = matrix.length;
        n = matrix[0].length;
        int[][] memo = new int[m][n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, memo));
            }
        }

        return ans;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] memo) {
        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        memo[i][j]++;

        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            memo[i][j] = Math.max(memo[i][j], dfs(matrix, i - 1, j, memo) + 1);
        }
        if (i < m - 1 && matrix[i + 1][j] > matrix[i][j]) {
            memo[i][j] = Math.max(memo[i][j], dfs(matrix, i + 1, j, memo) + 1);
        }
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            memo[i][j] = Math.max(memo[i][j], dfs(matrix, i, j - 1, memo) + 1);
        }
        if (j < n - 1 && matrix[i][j + 1] > matrix[i][j]) {
            memo[i][j] = Math.max(memo[i][j], dfs(matrix, i, j + 1, memo) + 1);
        }

        return memo[i][j];
    }
}
