package com.raphael.lc.offer56;

/**
 * @author Raphael
 * @date 2021-03-22 11:45:01
 */
class SingleNumbers {
    /**
     * Description for SingleNumbers:
     * 数组中数字出现的次数
     */
    public int[] singleNumbers(int[] nums) {
        // code
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }

        int a = 0, b = 0;
        int base = 1;
        while ((ret & base) == 0) {
            base <<= 1;
        }

        for (int n : nums) {
            if ((base & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }

        return new int[]{a, b};
    }
}
