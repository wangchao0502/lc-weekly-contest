package com.raphael.lc.common;

/**
 * @author raphael
 */
public class UnionFind {
    int[] parent;
    /**
     * 以 i 为根结点的子树的高度（引入了路径压缩以后该定义并不准确）
     */
    int[] rank;

    public UnionFind(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = i;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        if (rank[rootP] == rank[rootQ]) {
            parent[rootP] = rootQ;
            // 此时以 rootQ 为根结点的树的高度仅加了 1
            rank[rootQ]++;
        } else if (rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
            // 此时以 rootQ 为根结点的树的高度不变
        } else {
            // 同理，此时以 rootP 为根结点的树的高度不变
            parent[rootQ] = rootP;
        }
    }

    /**
     * 路径压缩
     */
    public int find(int x) {
        while (parent[x] != x) {
            x = parent[parent[x]];
        }
        return x;
    }

    public boolean isConnected(int q, int p) {
        return find(q) == find(p);
    }
}
