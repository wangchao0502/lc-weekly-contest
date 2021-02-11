package com.raphael.lc.p55;

/**
 * @author raphael
 * @date 2021-02-11 10:30:03
 */
class CanJump {
    /**
     * Description for CanJump:
     * 跳跃游戏
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farest = 0;

        for (int i = 0; i <= farest && i < n; i++) {
            farest = Math.max(farest, i + nums[i]);
            if (farest >= n - 1) {
                return true;
            }
        }

        return false;
    }
}
