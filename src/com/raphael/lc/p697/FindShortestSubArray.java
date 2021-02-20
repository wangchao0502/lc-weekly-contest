package com.raphael.lc.p697;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-02-20 09:57:14
 */
class FindShortestSubArray {
    /**
     * Description for FindShortestSubArray:
     * 数组的度
     */
    public int findShortestSubArray(int[] nums) {
        // 每个数字最左下标
        Map<Object, int[]> count = new HashMap<>(16);
        int ans = Integer.MAX_VALUE;
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] value = count.getOrDefault(n, new int[]{i, 0});
            value[1]++;
            count.put(n, value);
            if (value[1] > degree) {
                degree = value[1];
                ans = i - value[0] + 1;
            } else if (value[1] == degree) {
                ans = Math.min(ans, i - value[0] + 1);
            }
        }
        return ans;
    }
}
