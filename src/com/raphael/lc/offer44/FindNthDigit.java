package com.raphael.lc.offer44;

/**
 * @author Raphael
 * @date 2021-03-19 12:10:51
 */
class FindNthDigit {
    /**
     * Description for FindNthDigit:
     * 数字序列中某一位的数字
     */
    public int findNthDigit(int n) {
        // code
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
