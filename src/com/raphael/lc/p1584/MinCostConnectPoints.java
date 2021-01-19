package com.raphael.lc.p1584;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-19 20:20:42
 */
class MinCostConnectPoints {
    /**
     * Description for MinCostConnectPoints:
     * 给你一个points 数组，表示 2D 平面上的一些点，其中 points[i] = [xi, yi] 。
     * 连接点 [xi, yi] 和点 [xj, yj] 的费用为它们之间的 曼哈顿距离 ：|xi - xj| + |yi - yj| ，其中 |val| 表示
     * val 的绝对值。
     */
    public int minCostConnectPoints(int[][] points) {
        // code
        int len = points.length;
        UnionFind uf = new UnionFind(len);
        List<int[]> edges = new ArrayList<>();
        // build edges
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                edges.add(new int[]{i, j, Math.abs(points[j][0] - points[i][0]) + Math.abs(points[j][1] - points[i][1])});
            }
        }

        // sort edges
        edges.sort(Comparator.comparingInt(o -> o[2]));

        // put edge by order
        int ans = 0;
        for (int[] edge : edges) {
            if (uf.getCount() == len || !uf.isConnected(edge[0], edge[1])) {
                // 没有节点，直接连起来
                uf.union(edge[0], edge[1]);
                ans += edge[2];
            }
            if (uf.getCount() == 1) {
                return ans;
            }
        }

        return 0;
    }
}
