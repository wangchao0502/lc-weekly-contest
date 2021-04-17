package com.raphael.lc.biweekly50.p5719;

/**
 * @author Raphael
 * @date 2021-04-17 23:21:14
 */
class GetMaximumXor {
    /**
     * Description for GetMaximumXor:
     * 每个查询的最大异或值
     */
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        // code
        int n = nums.length;
        int[] ans = new int[n];
        int[] xor = new int[n];
        int target = (1 << maximumBit) - 1;

        for (int i = 0; i < n; i++) {
            xor[i] = i == 0 ? nums[i] : xor[i - 1] ^ nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[n - i - 1] = xor[i] ^ target;
        }

        return ans;
    }
}
