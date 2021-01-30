package com.raphael.lc.p778;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-30 10:14:31
 */
class SwimInWater {
    /**
     * Description for SwimInWater:
     * 水位上升的泳池中游泳
     */
    public int swimInWater(int[][] grid) {
        // code
        int n = grid.length;
        // edge = [u, v, t] t = max(height(u), height(v))
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    int t = Math.max(grid[i][j], grid[i - 1][j]);
                    edges.add(new int[]{i * n + j, (i - 1) * n + j, t});
                }
                if (j > 0) {
                    int t = Math.max(grid[i][j], grid[i][j - 1]);
                    edges.add(new int[]{i * n + j, i * n + j - 1, t});
                }
            }
        }

        edges.sort(Comparator.comparing(x -> x[2]));
        UnionFind uf = new UnionFind(n * n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
            if (uf.isConnected(0, n * n - 1)) {
                return edge[2];
            }
        }

        return 0;
    }
}
