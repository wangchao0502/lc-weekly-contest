package com.raphael.lc.p1631;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-29 21:23:21
 */
class MinimumEffortPath {
    /**
     * Description for MinimumEffortPath:
     * 最小体力消耗路径
     */
    public int minimumEffortPath(int[][] heights) {
        // code
        int m = heights.length;
        int n = heights[0].length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int id = n * i + j;
                if (i > 0) {
                    edges.add(new int[]{id - n, id, Math.abs(heights[i][j] - heights[i - 1][j])});
                }
                if (j > 0) {
                    edges.add(new int[]{id - 1, id, Math.abs(heights[i][j] - heights[i][j - 1])});
                }
            }
        }
        edges.sort(Comparator.comparingInt(o -> o[2]));
        UnionFind uf = new UnionFind(m * n);
        int ans = 0;
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1], v = edge[2];
            uf.union(x, y);
            if (uf.isConnected(0, m * n - 1)) {
                ans = v;
                break;
            }
        }
        return ans;
    }
}
