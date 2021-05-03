package com.raphael.lc.p7;

/**
 * @author Raphael
 * @date 2021-05-03 10:52:21
 */
class Reverse {
    /**
     * Description for Reverse:
     */
    public int reverse(int x) {
        // code
        int rev = 0;

        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }

        return rev;
    }
}
