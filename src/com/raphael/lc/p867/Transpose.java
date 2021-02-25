package com.raphael.lc.p867;

/**
 * @author Raphael
 * @date 2021-02-25 15:20:32
 */
class Transpose {
    /**
     * Description for Transpose:
     * 转置矩阵
     */
    public int[][] transpose(int[][] matrix) {
        // code
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
