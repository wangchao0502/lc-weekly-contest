package com.raphael.lc.p1052;

/**
 * @author Raphael
 * @date 2021-02-23 14:10:52
 */
class MaxSatisfied {
    /**
     * Description for MaxSatisfied:
     * 爱生气的书店老板
     */
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        // code 找到sw内grumpy为1的customers和的最大值
        int n = customers.length;
        int left = 0, right = 0;
        int max = 0;
        int maxL = 0, maxR = 0;
        int tmp = 0;

        while (right < n) {
            if (grumpy[right] == 1) {
                tmp += customers[right];
                if (tmp > max) {
                    max = tmp;
                    maxL = left;
                    maxR = right;
                }
            }
            right++;
            if (right - left == x) {
                // move left to first grumpy = 1
                if (grumpy[left] == 1) {
                    tmp -= customers[left];
                }
                do { left++; } while (left < right && grumpy[left] != 1);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i <= maxR && i >= maxL) {
                sum += customers[i];
            } else {
                sum += customers[i] * (grumpy[i] ^ 1);
            }
        }

        return sum;
    }
}
