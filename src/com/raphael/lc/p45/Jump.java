package com.raphael.lc.p45;

/**
 * @author raphael
 * @date 2021-02-09 15:31:33
 */
class Jump {
    /**
     * Description for Jump:
     * 跳跃游戏2
     */
    public int jump(int[] nums) {
        // code
        int step = 0, end = 0, now = 0;
        int n = nums.length - 1;
        int maxPos = 0;
        while (end < n) {
            maxPos = Math.max(maxPos, nums[now] + now);
            if (now == end) {
                step++;
                end = maxPos;
            }
            now++;
        }
        return step;
    }
}
