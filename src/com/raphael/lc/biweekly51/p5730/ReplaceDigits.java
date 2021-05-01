package com.raphael.lc.biweekly51.p5730;

/**
 * @author Raphael
 * @date 2021-05-01 22:55:05
 */
class ReplaceDigits {
    /**
     * Description for ReplaceDigits:
     * 将所有数字用字符替换
     */
    public String replaceDigits(String s) {
        // code
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 1) {
                sb.append((char) (s.charAt(i - 1) + s.charAt(i) - '0'));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
