package com.raphael.lc.p685;

/**
 * @author Raphael
 * @date 2021-05-18 11:54:31
 */

class UnionFind {
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

    public boolean union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return false;
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
        return true;
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
}

class FindRedundantDirectedConnection {
    /**
     * Description for FindRedundantDirectedConnection:
     * 冗余连接2
     */
    public int[] findRedundantDirectedConnection(int[][] edges) {
        // code
        int nodesCount = edges.length;
        UnionFind uf = new UnionFind(nodesCount + 1);
        int[] parent = new int[nodesCount + 1];
        for (int i = 1; i <= nodesCount; ++i) {
            parent[i] = i;
        }
        int conflict = -1;
        int cycle = -1;
        for (int i = 0; i < nodesCount; ++i) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (parent[node2] != node2) {
                conflict = i;
            } else {
                parent[node2] = node1;
                if (uf.find(node1) == uf.find(node2)) {
                    cycle = i;
                } else {
                    uf.union(node1, node2);
                }
            }
        }
        if (conflict < 0) {
            return new int[]{edges[cycle][0], edges[cycle][1]};
        } else {
            int[] conflictEdge = edges[conflict];
            int[] redundant;
            if (cycle >= 0) {
                redundant = new int[]{parent[conflictEdge[1]], conflictEdge[1]};
            } else {
                redundant = new int[]{conflictEdge[0], conflictEdge[1]};
            }
            return redundant;
        }
    }
}
