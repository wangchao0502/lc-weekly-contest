package com.raphael.lc.p79;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 15:55:53
 */
class Exist {
    /**
     * Description for Exist:
     * 单词搜索
     */

    boolean[][] visited;
    String target;
    char[][] board;
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean backtracking(int start, int i, int j, List<Character> list) {
        if (list.size() == target.length()) {
            return true;
        }

        visited[i][j] = true;
        boolean ans = false;
        for (int[] direct : directions) {
            int i2 = i + direct[0];
            int j2 = j + direct[1];
            if (i2 < 0 || i2 >= board.length || j2 < 0 || j2 >= board[0].length || visited[i2][j2]) {
                continue;
            }
            char c = board[i2][j2];
            list.add(c);
            if (c == target.charAt(start) && backtracking(start + 1, i2, j2, list)) {
                ans = true;
                break;
            }
            list.remove(list.size() - 1);
        }
        visited[i][j] = false;

        return ans;
    }

    public boolean exist(char[][] board, String word) {
        // code
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        target = word;
        this.board = board;
        List<Character> list = new ArrayList<>();
        list.add(word.charAt(0));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && backtracking(1, i, j, list)) {
                    return true;
                }
            }
        }
        return false;
    }
}
