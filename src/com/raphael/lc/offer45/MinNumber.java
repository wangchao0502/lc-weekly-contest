package com.raphael.lc.offer45;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-19 13:44:30
 */
class MinNumber {
    /**
     * Description for MinNumber:
     * 把数组排成最小的数
     */
    public String minNumber(int[] nums) {
        // code
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        for (String s : strs) {
            sb.append(s);
        }

        return sb.toString();
    }
}
