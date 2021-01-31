package com.raphael.lc.weekly226.p5666;

/**
 * @author raphael
 * @date 2021-01-31 11:36:50
 */
class CheckPartitioning {
    /**
     * Description for CheckPartitioning:
     * 回文串分割 4
     */
    public boolean checkPartitioning(String s) {
        // code
        int n = s.length();
        boolean[][] f = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    f[i][j] = true;
                } else {
                    boolean b = s.charAt(i) == s.charAt(j);
                    if (i + 1 == j) {
                        f[i][j] = b;
                    } else {
                        f[i][j] = b && f[i + 1][j - 1];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (f[0][i] && f[i + 1][j] && f[j + 1][n - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
