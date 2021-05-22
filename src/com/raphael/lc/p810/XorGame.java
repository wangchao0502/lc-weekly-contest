package com.raphael.lc.p810;

/**
 * @author Raphael
 * @date 2021-05-22 10:39:49
 */
class XorGame {
    /**
     * Description for XorGame:
     * 黑板异或游戏
     */
    public boolean xorGame(int[] nums) {
        // code
        if (nums.length % 2 == 0) {
            return true;
        }
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor == 0;
    }
}
