package com.raphael.lc.p477;

/**
 * @author Raphael
 * @date 2021-05-28 13:39:33
 */
class TotalHammingDistance {
    /**
     * Description for TotalHammingDistance:
     * 汉明距离总和
     */
    public int totalHammingDistance(int[] nums) {
        // code
        int ans = 0, n = nums.length;
        for (int i = 0; i < 30; ++i) {
            int c = 0;
            for (int val : nums) {
                c += (val >> i) & 1;
            }
            ans += c * (n - c);
        }
        return ans;
    }
}
