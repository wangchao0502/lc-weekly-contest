package com.raphael.lc.weekly240.p5751;

/**
 * @author Raphael
 * @date 2021-05-09 10:53:31
 */
class MaxDistance {
    /**
     * Description for MaxDistance:
     * 下标对中的最大距离
     */
    public int maxDistance(int[] nums1, int[] nums2) {
        // code
        int n = nums1.length, m = nums2.length;
        int ans = 0;
        int ptr = -1;
        for (int i = 0; i < n; ++i) {
            while (ptr + 1 < m && nums1[i] <= nums2[ptr + 1])
                ptr++;
            ans = Math.max(ans, ptr - i);
        }
        return ans;
    }
}
