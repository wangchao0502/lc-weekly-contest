package com.raphael.lc.p766;

/**
 * @author Raphael
 * @date 2021-02-22 16:14:16
 */
class IsToeplitzMatrix {
    /**
     * Description for IsToeplitzMatrix:
     * 托普利茨矩阵
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        // code
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
