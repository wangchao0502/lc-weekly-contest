package com.raphael.lc.offer39;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-03-17 11:53:00
 */
class MajorityElement {
    /**
     * Description for MajorityElement:
     * 数组中出现次数超过一般的数字
     */
    public int majorityElement(int[] nums) {
        // code
        Arrays.sort(nums);
        return nums[(nums.length + 1) / 2];
    }
}
