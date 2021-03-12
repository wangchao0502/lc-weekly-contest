package com.raphael.lc.offer12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-12 11:18:43
 */
class Exist {
    /**
     * Description for Exist:
     * 矩阵中的路径
     */

    boolean[][] visited;
    int[][] directions = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
    boolean isFind;

    private void dfs(char[][] board, int m, int n, int index, int count, String word) {
        if (count == word.length() && !isFind) {
            isFind = true;
            return;
        }
        if (isFind) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        for (int[] direction : directions) {
            int i = m + direction[0];
            int j = n + direction[1];
            if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i][j] && board[i][j] == word.charAt(index)) {
                visited[i][j] = true;
                count++;
                dfs(board, i, j, index + 1, count, word);
                count--;
                visited[i][j] = false;
            }
        }
    }

    public boolean exist(char[][] board, String word) {
        // code
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j]) {
                    visited[i][j] = true;
                    dfs(board, i, j, 1, 1, word);
                    if (isFind) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return isFind;
    }
}
