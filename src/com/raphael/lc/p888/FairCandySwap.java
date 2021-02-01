package com.raphael.lc.p888;

import java.util.HashSet;
import java.util.Set;

/**
 * @author raphael
 * @date 2021-02-01 11:49:15
 */
class FairCandySwap {
    /**
     * Description for FairCandySwap:
     * 公平的糖果棒交换
     */
    public int[] fairCandySwap(int[] a, int[] b) {
        // code
        Set<Integer> bSet = new HashSet<>();
        int total = 0;
        int sumA = 0;
        for (int n : a) {
            total += n;
            sumA += n;
        }
        for (int n : b) {
            total += n;
            bSet.add(n);
        }
        int target = total / 2;
        for (int n : a) {
            int k = target - sumA + n;
            if (bSet.contains(k)) {
                return new int[]{n, k};
            }
        }
        return null;
    }
}
