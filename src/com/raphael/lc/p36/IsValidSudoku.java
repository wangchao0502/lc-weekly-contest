package com.raphael.lc.p36;

import java.util.HashMap;

/**
 * @author raphael
 * @date 2021-01-14 18:49:19
 */
class IsValidSudoku {
    /**
     * Description for IsValidSudoku:
     * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
     */
    @SuppressWarnings("unchecked")
    public boolean isValidSudoku(char[][] board) {
        // code
        int len = board.length;
        HashMap<Integer, Integer>[] blkMaps = new HashMap[len];
        HashMap<Integer, Integer>[] colMaps = new HashMap[len];
        HashMap<Integer, Integer>[] rowMaps = new HashMap[len];

        // init hashmap list
        for (int i = 0; i < board.length; i++) {
            blkMaps[i] = new HashMap<>(8);
            colMaps[i] = new HashMap<>(8);
            rowMaps[i] = new HashMap<>(8);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int n;
                    n = c;
                    int b = (i / 3) * 3 + j / 3;

                    rowMaps[i].put(n, rowMaps[i].getOrDefault(n, 0) + 1);
                    colMaps[j].put(n, colMaps[j].getOrDefault(n, 0) + 1);
                    blkMaps[b].put(n, blkMaps[b].getOrDefault(n, 0) + 1);

                    if (rowMaps[i].get(n) > 1 || colMaps[j].get(n) > 1 || blkMaps[b].get(n) > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
