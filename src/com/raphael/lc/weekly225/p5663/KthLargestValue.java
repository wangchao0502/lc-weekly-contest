package com.raphael.lc.weekly225.p5663;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-24 11:28:27
 */
class KthLargestValue {
    /**
     * Description for KthLargestValue:
     * 找出第K大的异或坐标值
     */
    public int kthLargestValue(int[][] matrix, int k) {
        // code
        int m = matrix.length;
        int n = matrix[0].length;
        int[] computed = new int[m * n];
        // computed[i,j] = computed[i-1][j] xor line[i][j]
        // first line
        computed[0] = matrix[0][0];
        for (int i = 1; i < n; i++) {
            computed[i] = computed[i - 1] ^ matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            int[] line = new int[n];
            line[0] = matrix[i][0];
            computed[i * n] = computed[(i - 1) * n] ^ line[0];
            for (int j = 1; j < n; j++) {
                line[j] = line[j - 1] ^ matrix[i][j];
                computed[i * n + j] = computed[(i - 1) * n + j] ^ line[j];
            }
        }

        Arrays.sort(computed);

        return computed[m * n - k];
    }
}
