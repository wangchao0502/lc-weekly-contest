package com.raphael.lc.p496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-24 10:51:59
 */
class NextGreaterElement {
    /**
     * Description for NextGreaterElement:
     * 下一个更大元素1
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // code
        Map<Integer, Integer> map = new HashMap<>(16);
        Stack<Integer> stack = new Stack<>();

        for (int j : nums2) {
            while (!stack.isEmpty() && stack.peek() < j) {
                int n = stack.pop();
                map.putIfAbsent(n, j);
            }
            stack.push(j);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
