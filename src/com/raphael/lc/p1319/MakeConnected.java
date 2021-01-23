package com.raphael.lc.p1319;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-23 18:32:54
 */
class MakeConnected {
    /**
     * Description for MakeConnected:
     * 联通网络的操作次数
     */
    public int makeConnected(int n, int[][] connections) {
        // code
        UnionFind uf = new UnionFind(n);
        int extra = 0;
        for (int[] connect : connections) {
            if (!uf.isConnected(connect[0], connect[1])) {
                uf.union(connect[0], connect[1]);
            } else {
                extra++;
            }
        }
        if (uf.getCount() - 1 <= extra) {
            return uf.getCount() - 1;
        }
        return -1;
    }
}
