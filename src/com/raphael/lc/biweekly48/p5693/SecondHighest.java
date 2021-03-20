package com.raphael.lc.biweekly48.p5693;

/**
 * @author Raphael
 * @date 2021-03-20 22:31:47
 */
class SecondHighest {
    /**
     * Description for SecondHighest:
     * 字符串中第二大的数字
     */
    public int secondHighest(String s) {
        // code
        int maxNum = -1;
        int lessMaxNum = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int n = c - '0';
                if (n > maxNum) {
                    lessMaxNum = maxNum;
                    maxNum = n;
                } else if (n < maxNum && n > lessMaxNum) {
                    lessMaxNum = n;
                }
            }
        }

        return lessMaxNum;
    }
}
