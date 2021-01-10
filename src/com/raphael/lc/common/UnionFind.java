package com.raphael.lc.common;

public class UnionFind {
    int[] parent;

    public UnionFind(int n) {
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            parent[rootP] = rootQ;
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
