package com.raphael.lc.p765;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-02-14 12:57:31
 */
class MinSwapsCouples {
    /**
     * Description for MinSwapsCouples:
     *
     */
    public int minSwapsCouples(int[] row) {
        // code
        int len = row.length;
        int n = len / 2;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < len; i += 2) {
            uf.union(row[i] / 2, row[i + 1] / 2);
        }
        return n - uf.getCount();
    }
}
