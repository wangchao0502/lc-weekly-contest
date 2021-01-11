package com.raphael.lc.weekly223.p1722;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-10 10:56:58
 */
class MinimumHammingDistance {
    /**
     * Description for MinimumHammingDistance:
     * 给你两个整数数组 source 和 target ，长度都是 n 。还有一个数组 allowedSwaps ，其中每个 allowedSwaps[i] = [ai, bi] 表示你可以交换数组 source 中下标为 ai 和 bi（下标从 0 开始）的两个元素。注意，你可以按 任意 顺序 多次 交换一对特定下标指向的元素。
     * 相同长度的两个数组 source 和 target 间的 汉明距离 是元素不同的下标数量。形式上，其值等于满足 source[i] != target[i] （下标从 0 开始）的下标 i（0 <= i <= n-1）的数量。
     * 在对数组 source 执行 任意 数量的交换操作后，返回 source 和 target 间的 最小汉明距离 。
     */
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        // code
        int len = source.length;
        UnionFind uf = new UnionFind(len);
        for (int[] a : allowedSwaps) {
            uf.union(a[0], a[1]);
        }
        HashMap<Integer, List<Integer>> tMap = new HashMap<>(8);
        for (int i = 0; i < len; i++) {
            List<Integer> list = tMap.getOrDefault(target[i], new ArrayList<>());
            list.add(i);
            tMap.put(target[i], list);
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            List<Integer> list = tMap.getOrDefault(source[i], new ArrayList<>());
            boolean isMissing = true;
            for (int j = 0; j < list.size(); j++) {
                if (uf.isConnected(i, list.get(j))) {
                    list.remove(j);
                    tMap.put(source[i], list);
                    isMissing = false;
                    break;
                }
            }
            if (isMissing) {
                ans++;
            }
        }
        return ans;
    }
}
