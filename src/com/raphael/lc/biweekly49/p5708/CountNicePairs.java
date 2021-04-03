package com.raphael.lc.biweekly49.p5708;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-04-03 23:16:57
 */
class CountNicePairs {
    /**
     * Description for CountNicePairs:
     * 统计一个数组中好对子的数目
     */
    private int rev(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }

    public int countNicePairs(int[] nums) {
        // code
        int n = nums.length;
        // nums[i] - rev(nums[i]) = nums[j] - rev(nums[j])
        // f(i) -> count
        Map<Integer, Integer> map = new HashMap<>(16);
        int[] revs = new int[n];

        for (int i = 0; i < n; i++) {
            revs[i] = rev(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            int x = nums[i] - revs[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        long ans = 0;

        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val > 1) {
                ans += (long) val * (val - 1) / 2;
            }
        }

        return (int) (ans % 1000000007);
    }
}
