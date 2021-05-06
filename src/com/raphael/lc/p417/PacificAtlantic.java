package com.raphael.lc.p417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-06 14:31:41
 */
class PacificAtlantic {
    /**
     * Description for PacificAtlantic:
     * 太平洋大西洋水流问题
     */

    int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m, n;
    int[][] matrix;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // code
        List<List<Integer>> ans = new ArrayList<>();
        matrix = heights;
        m = matrix.length;
        if (m == 0) return ans;
        n = matrix[0].length;
        if (n == 0) return ans;

        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canReachA = new boolean[m][n];

        for (int i = 0; i < n; i++) {
            dfs(0, i, canReachP);
            dfs(m - 1, i, canReachA);
        }
        for (int i = 0; i < m; i++) {
            dfs(i, 0, canReachP);
            dfs(i, n - 1, canReachA);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachA[i][j] && canReachP[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int x, int y, boolean[][] canReach) {
        canReach[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];
            if (isIn(newX, newY) && matrix[x][y] <= matrix[newX][newY] && !canReach[newX][newY]) {
                dfs(newX, newY, canReach);
            }
        }
    }

    private boolean isIn(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
