package com.raphael.lc.p1442;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-18 11:42:38
 */
class CountTriplets {
    /**
     * Description for CountTriplets:
     * 形成两个异或相等数组的三元组数目
     */
    public int countTriplets(int[] arr) {
        // code
        int n = arr.length;
        Map<Integer, Integer> cnt = new HashMap<>(16);
        Map<Integer, Integer> total = new HashMap<>(16);
        int ans = 0, s = 0;
        for (int k = 0; k < n; ++k) {
            int val = arr[k];
            if (cnt.containsKey(s ^ val)) {
                ans += cnt.get(s ^ val) * k - total.get(s ^ val);
            }
            cnt.put(s, cnt.getOrDefault(s, 0) + 1);
            total.put(s, total.getOrDefault(s, 0) + k);
            s ^= val;
        }
        return ans;
    }
}
