package com.raphael.lc.p947;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-15 20:47:23
 */
class RemoveStones {
    /**
     * Description for RemoveStones:
     * 块石头放置在二维平面中的一些整数坐标点上。每个坐标点上最多只能有一块石头。
     * 如果一块石头的 同行或者同列 上有其他石头存在，那么就可以移除这块石头。
     * 给你一个长度为 n 的数组 stones ，其中 stones[i] = [xi, yi] 表示第 i 块石头的位置，返回 可以移除的石子 的最大数量。
     * 1 <= stones.length <= 1000
     * 0 <= xi, yi <= 104
     */
    public int removeStones(int[][] stones) {
        // code
        int n = stones.length;
        // 105方便二维映射到一维
        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    uf.union(i, j);
                }
            }
        }

        return n - uf.getCount();
    }
}
