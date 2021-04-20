package com.raphael.lc.p1253;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-20 15:46:22
 */
class ReconstructMatrix {
    /**
     * Description for ReconstructMatrix:
     * 重构2行二进制矩阵
     */
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        // code
        int n = colsum.length;
        int upperOrigin = upper, lowerOrigin = lower;
        int[][] ans = new int[2][n];
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (colsum[i] == 2) {
                ans[0][i] = 1;
                ans[1][i] = 1;
                upper--;
                lower--;
            }
            if (colsum[i] == 0 || colsum[i] == 2) {
                vis[i] = true;
            }
        }

        int rest = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                rest += colsum[i];
            }
        }

        if (rest != upper + lower) return new ArrayList<>();

        // fill empty
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (upper > 0) {
                    ans[0][i] = 1;
                    upper--;
                } else if (lower > 0) {
                    ans[1][i] = 1;
                    lower--;
                }
            }
        }

        List<List<Integer>> ansList = new ArrayList<>();
        ansList.add(new ArrayList<>());
        ansList.add(new ArrayList<>());
        int upperSum = 0;
        int lowerSum = 0;

        for (int i = 0; i < n; i++) {
            ansList.get(0).add(ans[0][i]);
            upperSum += ans[0][i];
            ansList.get(1).add(ans[1][i]);
            lowerSum += ans[1][i];
        }

        if (upperSum != upperOrigin || lowerSum != lowerOrigin) return new ArrayList<>();

        return ansList;
    }
}
