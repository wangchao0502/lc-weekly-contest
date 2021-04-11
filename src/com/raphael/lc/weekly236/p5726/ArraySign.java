package com.raphael.lc.weekly236.p5726;

/**
 * @author Raphael
 * @date 2021-04-11 10:36:15
 */
class ArraySign {
    /**
     * Description for ArraySign:
     * 数组元素积的符号
     */
    public int arraySign(int[] nums) {
        // code
        int ans = 1;
        for (int n : nums) {
            if (n == 0) return 0;
            if (n < 0) ans = -ans;
        }
        return ans;
    }
}
