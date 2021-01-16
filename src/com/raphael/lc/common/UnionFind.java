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
    /**
     * 联通分量个数
     */
    int count;
    /**
     * 以当前节点为根节点的子树的节点总数
     */
    int[] size;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = i;
            size[i] = 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        // 合并调整size和rank
        if (rank[rootP] == rank[rootQ]) {
            parent[rootP] = rootQ;
            // 此时以 rootQ 为根结点的树的高度仅加了 1
            rank[rootQ]++;
            size[rootQ] += size[rootP];
        } else if (rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
            // 此时以 rootQ 为根结点的树的高度不变
            size[rootQ] += size[rootP];
        } else {
            // 同理，此时以 rootP 为根结点的树的高度不变
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
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

    public int getSize(int x) {
        return size[find(x)];
    }
}
