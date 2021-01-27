package com.raphael.lc.p1579;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-27 20:36:42
 */
class MaxNumEdgesToRemove {
    /**
     * Description for MaxNumEdgesToRemove:
     * 保证图可完全遍历
     */
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        // code
        UnionFind ufa = new UnionFind(n);
        UnionFind ufb = new UnionFind(n);
        int ans = 0;

        // 节点编号改为从 0 开始
        for (int[] edge : edges) {
            edge[1]--;
            edge[2]--;
        }

        // 公共边
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!ufa.union(edge[1], edge[2])) {
                    ans++;
                } else {
                    ufb.union(edge[1], edge[2]);
                }
            }
        }

        // 独占边
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!ufa.union(edge[1], edge[2])) {
                    ans++;
                }
            }
            if (edge[0] == 2) {
                if (!ufb.union(edge[1], edge[2])) {
                    ans++;
                }
            }
        }

        if (ufa.getCount() != 1 || ufb.getCount() != 1) {
            return -1;
        }

        return ans;
    }
}
