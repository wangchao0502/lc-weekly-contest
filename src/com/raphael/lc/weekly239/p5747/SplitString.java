package com.raphael.lc.weekly239.p5747;

/**
 * @author Raphael
 * @date 2021-05-02 10:39:06
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class SplitString {
    /**
     * Description for SplitString:
     * 将字符串拆分为递减的连续值
     */
    private boolean backtracking(long last, int start, String s, int n, int count) {
        if (start == n) {
            return count > 1;
        }
        if (last == 0 && Long.parseLong(s.substring(start)) == 0) {
            return true;
        }

        for (int i = 1; i <= n - start; i++) {
            String str = s.substring(start, start + i);
            long cur = Long.parseLong(str);
            if (last - 1 == cur) {
                return backtracking(cur, start + i, s, n, count + 1);
            }
            if (cur > last) {
                break;
            }
        }
        return false;
    }

    public boolean splitString(String s) {
        // code
        int n = s.length();
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                start++;
            } else {
                break;
            }
        }

        if (start == n) {
            return false;
        }

        for (int i = 1; i <= (n - start) / 2 + 1; i++) {
            String initStr = s.substring(start, start + i);
            if (backtracking(Long.parseLong(initStr), start + i, s, n, 1)) {
                return true;
            }
        }

        return false;
    }
}
