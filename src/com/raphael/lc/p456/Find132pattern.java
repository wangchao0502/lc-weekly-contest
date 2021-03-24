package com.raphael.lc.p456;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-24 10:02:23
 */
class Find132pattern {
    /**
     * Description for Find132pattern:
     * 132模式
     */
    public boolean find132pattern(int[] nums) {
        // code
        int n = nums.length;
        if (n < 3) return false;

        Stack<Integer> stack = new Stack<>();
        int secMaxVal = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < secMaxVal) return true;
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                secMaxVal = stack.pop();
            }
            stack.push(nums[i]);
        }

        return false;
    }
}
