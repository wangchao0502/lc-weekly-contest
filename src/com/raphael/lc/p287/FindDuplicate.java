package com.raphael.lc.p287;

/**
 * @author raphael
 * @date 2021-02-05 13:32:09
 */
class FindDuplicate {
    /**
     * Description for FindDuplicate:
     * 寻找重复数 Floyd 判圈算法
     */
    public int findDuplicate(int[] nums) {
        // code
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
