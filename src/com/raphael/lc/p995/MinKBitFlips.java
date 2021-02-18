package com.raphael.lc.p995;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Raphael
 * @date 2021-02-18 09:57:35
 */
class MinKBitFlips {
    /**
     * Description for MinKBitFlips:
     * K 连续位的最小翻转次数
     */
    public int minKBitFlips(int[] a, int k) {
        int n = a.length;
        Deque<Integer> queue = new LinkedList<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!queue.isEmpty() && queue.peekFirst() <= i - k) {
                queue.pollFirst();
            }
            // short for ->
            // boolean flip = queue.size() % 2 == 1;
            // a[i] == 1 && flip || a[i] == 0 && !flip
            if (queue.size() % 2 == a[i]) {
                if (i + k > n) {
                    return -1;
                }
                queue.addLast(i);
                ans++;
            }
        }
        return ans;
    }
}
