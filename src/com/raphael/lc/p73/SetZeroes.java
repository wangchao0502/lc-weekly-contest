package com.raphael.lc.p73;

/**
 * @author raphael
 * @date 2021-02-13 13:57:32
 */
class SetZeroes {
    /**
     * Description for SetZeroes:
     * 矩阵置零
     */
    public void setZeroes(int[][] matrix) {
        // code
        boolean isCol = false;
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
