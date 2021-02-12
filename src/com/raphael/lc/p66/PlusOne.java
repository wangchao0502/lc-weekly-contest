package com.raphael.lc.p66;

/**
 * @author raphael
 * @date 2021-02-12 12:24:42
 */
class PlusOne {
    /**
     * Description for PlusOne:
     * 加一
     */
    public int[] plusOne(int[] digits) {
        // code
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
