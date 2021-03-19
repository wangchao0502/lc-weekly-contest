package com.raphael.lc.offer43;

/**
 * @author Raphael
 * @date 2021-03-19 10:32:25
 */
class CountDigitOne {
    /**
     * Description for CountDigitOne:
     * 1-n 整数中1出现的次数
     */
    public int countDigitOne(int n) {
        // code
        // 数字的长度
        char[] nums = String.valueOf(n).toCharArray();
        int base = (int) Math.pow(10, nums.length - 1);
        int high = 0;
        int low = n % base;
        int ans = 0;

        for (char num : nums) {
            if (num == '0') {
                ans += high * base;
            } else if (num == '1') {
                ans += high * base + low + 1;
            } else {
                ans += (high + 1) * base;
            }
            base /= 10;
            high = high * 10 + num - '0';
            if (base > 0) {
                low %= base;
            }
        }

        return ans;
    }
}
