package com.raphael.lc.p1221;

/**
 * @author Raphael
 * @date 2021-04-19 12:21:26
 */
class BalancedStringSplit {
    /**
     * Description for BalancedStringSplit:
     * 分割平衡字符串
     */
    public int balancedStringSplit(String s) {
        // code
        int ans = 0;
        int l = 0, r = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') l++;
            else r++;
            if (l == r) {
                ans++;
                l = 0;
                r = 0;
            }
        }

        return ans;
    }
}
