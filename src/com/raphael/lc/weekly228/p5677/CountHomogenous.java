package com.raphael.lc.weekly228.p5677;

/**
 * @author raphael
 * @date 2021-02-14 10:41:37
 */
class CountHomogenous {
    /**
     * Description for CountHomogenous:
     * 统计同构子字符串的数目
     */
    public int countHomogenous(String s) {
        // code
        long ans = 0;
        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        int n = s.length();

        while (right < n) {
            if (chars[right] == chars[left]) {
                ans += right - left + 1;
            } else {
                left = right;
                ans += 1;
            }
            right++;
        }

        return (int) (ans % (1e9 + 7));
    }
}
