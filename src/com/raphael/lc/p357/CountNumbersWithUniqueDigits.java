package com.raphael.lc.p357;

/**
 * @author Raphael
 * @date 2021-03-03 17:26:16
 */
class CountNumbersWithUniqueDigits {
    /**
     * Description for CountNumbersWithUniqueDigits:
     * 计算各个位数不同的数字个数
     */
    public int countNumbersWithUniqueDigits(int n) {
        // code
        if (n == 0) return 1;
        n = Math.min(n, 10);
        int ans = 10, base = 9, sum = 9;
        for (int i = 1; i < n; ++i) {
            ans += sum *= base--;
        }
        return ans;
    }
}
