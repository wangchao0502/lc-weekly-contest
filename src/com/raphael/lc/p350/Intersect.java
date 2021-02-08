package com.raphael.lc.p350;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-02-07 22:50:20
 */
class Intersect {
    /**
     * Description for Intersect:
     * 两个数组的交集
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // code
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new LinkedList<>();
        for (int n : nums2) {
            if (map.getOrDefault(n, 0) > 0) {
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
