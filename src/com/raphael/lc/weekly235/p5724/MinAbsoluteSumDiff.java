package com.raphael.lc.weekly235.p5724;

/**
 * @author Raphael
 * @date 2021-04-04 10:46:06
 */
class MinAbsoluteSumDiff {
    /**
     * Description for MinAbsoluteSumDiff:
     * 绝对差值和
     */
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        // code
        int n = nums1.length;
        int[] absArr = new int[n];
        int maxIdx = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            absArr[i] = Math.abs(nums1[i] - nums2[i]);
            if (absArr[i] > max) {
                max = absArr[i];
                maxIdx = i;
            }
        }

        int min = absArr[maxIdx];

        for (int j : nums1) {
            int x = Math.abs(j - nums2[maxIdx]);
            if (x < min) {
                min = x;
            }
        }

        absArr[maxIdx] = min;

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += absArr[i];
        }

        return (int) (ans % 1000000007);
    }
}
