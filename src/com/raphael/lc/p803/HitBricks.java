package com.raphael.lc.p803;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-16 15:53:43
 */
class HitBricks {
    /**
     * Description for HitBricks:
     * 有一个 m x n 的二元网格，其中 1 表示砖块，0 表示空白。砖块 稳定（不会掉落）的前提是：
     * 1. 一块砖直接连接到网格的顶部，或者
     * 2. 至少有一块相邻（4 个方向之一）砖块 稳定 不会掉落时
     * 给你一个数组 hits ，这是需要依次消除砖块的位置。每当消除 hits[i] = (rowi, coli) 位置上的砖块时，对应位置的砖块（若存在）会消
     * 失，然后其他的砖块可能因为这一消除操作而掉落。一旦砖块掉落，它会立即从网格中消失（即，它不会落在其他稳定的砖块上）。
     * 返回一个数组 result ，其中 result[i] 表示第 i 次消除操作对应掉落的砖块数目。
     * 注意，消除可能指向是没有砖块的空白位置，如果发生这种情况，则没有砖块掉落。
     */

    private int rows;
    private int cols;

    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int[] hitBricks(int[][] grid, int[][] hits) {
        // code
        this.rows = grid.length;
        this.cols = grid[0].length;

        // 把grid中的砖头全部击碎，通产算法问题不能修改输入数据
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            if (cols >= 0) {
                System.arraycopy(grid[i], 0, copy[i], 0, cols);
            }
        }

        // 把copy中的砖头全部击碎
        for (int[] hit : hits) {
            copy[hit[0]][hit[1]] = 0;
        }

        // 建图，size表示虚拟屋顶
        int size = rows * cols;
        UnionFind uf = new UnionFind(size + 1);

        // 将下表为0的一行与屋顶相连
        for (int j = 0; j < cols; j++) {
            if (copy[0][j] == 1) {
                uf.union(j, size);
            }
        }

        // 关联其他砖块
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (copy[i][j] == 1) {
                    if (copy[i - 1][j] == 1) {
                        uf.union(getIndex(i - 1, j), getIndex(i, j));
                    }
                    if (j > 0 && copy[i][j - 1] == 1) {
                        uf.union(getIndex(i, j - 1), getIndex(i, j));
                    }
                }
            }
        }

        // 补砖块
        int len = hits.length;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            int x = hits[i][0];
            int y = hits[i][1];
            if (grid[x][y] == 0) {
                continue;
            }
            int origin = uf.getSize(size);
            if (x == 0) {
                uf.union(y, size);
            }
            for (int[] direction : DIRECTIONS) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                if (inArea(newX, newY) && copy[newX][newY] == 1) {
                    uf.union(getIndex(x, y), getIndex(newX, newY));
                }
            }
            int current = uf.getSize(size);
            res[i] = Math.max(0, current - origin - 1);
            copy[x][y] = 1;
        }

        return res;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    private int getIndex(int x, int y) {
        return x * cols + y;
    }
}
