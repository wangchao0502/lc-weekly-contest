package com.raphael.lc.p59;

/**
 * @author Raphael
 * @date 2021-03-16 13:39:43
 */
class GenerateMatrix {
    /**
     * Description for GenerateMatrix:
     * 螺旋矩阵2
     */
    public int[][] generateMatrix(int n) {
        // code
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {
            ans[0][i] = i + 1;
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dirIndex = 1;
        int countDown = n - 1;
        int loopCount = 0;

        int row = 0;
        int col = n - 1;
        int i = n + 1;

        while (i <= n * n) {
            int k = 0;
            while (k < countDown) {
                row += directions[dirIndex][0];
                col += directions[dirIndex][1];
                ans[row][col] = i;
                k++;
                i++;
            }
            loopCount++;
            dirIndex++;
            if (dirIndex == 4) {
                dirIndex = 0;
            }
            if ((loopCount & 1) == 0) {
                countDown--;
            }
        }

        return ans;
    }
}
