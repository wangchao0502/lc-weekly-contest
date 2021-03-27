package com.raphael.lc.p880;

/**
 * @author Raphael
 * @date 2021-03-27 17:23:22
 */
class DecodeAtIndex {
    /**
     * Description for DecodeAtIndex:
     * 索引处的解码字符串
     */
    public String decodeAtIndex(String s, int k) {
        // code
        long size = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                size *= c - '0';
            } else {
                size++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size;
            if (k == 0 && Character.isLetter(c)) {
                return Character.toString(c);
            }
            if (Character.isDigit(c)) {
                size /= c - '0';
            } else {
                size--;
            }
        }

        return null;
    }
}
