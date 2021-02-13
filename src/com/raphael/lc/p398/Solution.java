package com.raphael.lc.p398;

import java.util.Random;

/**
 * @author raphael
 * @date 2021-02-13 20:13:54
 */
class Solution {
    /**
     * Description for Solution:
     * 蓄水池抽样
     */

    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random random = new Random();
        int n = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                n++;
                if (random.nextInt(n) == 0) {
                    index = i;
                }
            }
        }

        return index;
    }
}
