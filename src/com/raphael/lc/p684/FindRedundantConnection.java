package com.raphael.lc.p684;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-13 10:13:09
 */
class FindRedundantConnection {
    /**
     * Description for FindRedundantConnection:
     * 在本问题中, 树指的是一个连通且无环的无向图。
     * 输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属
     * 于树中已存在的边。
     * 结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。
     * 返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边 [u, v] 应满足相同的格式 u < v。
     */
    public int[] findRedundantConnection(int[][] edges) {
        // code
        UnionFind uf = new UnionFind(edges.length + 1);

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (uf.isConnected(u, v)) {
                return u > v ? new int[]{v, u} : new int[]{u, v};
            } else {
                uf.union(u, v);
            }
        }

        return new int[]{};
    }
}
