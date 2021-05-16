package com.raphael.lc.p5761;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-16 11:09:54
 */
class FindSumPairs {
    /**
     * Description for FindSumPairs:
     * 找出和为指定值的下标对
     */

    Map<Integer, Integer> map;
    int[] nums1;
    int[] nums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>(16);
        for (int n : nums2) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int n = nums2[index];
        nums2[index] += val;
        map.put(n, map.get(n) - 1);
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int ans = 0;
        for (int n : nums1) {
            ans += map.getOrDefault(tot - n, 0);
        }
        return ans;
    }
}
