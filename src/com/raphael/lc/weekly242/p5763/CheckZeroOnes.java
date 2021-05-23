package com.raphael.lc.weekly242.p5763;

/**
 * @author Raphael
 * @date 2021-05-23 10:32:51
 */
class CheckZeroOnes {
    /**
     * Description for CheckZeroOnes:
     * 那种连续子字符串更长
     */
    public boolean checkZeroOnes(String s) {
        // code
        int maxOne = 0;
        int maxZero = 0;
        int count = 1;
        char lastChar = s.charAt(0);
        char[] chars = s.toCharArray();

        if (lastChar == '1') {
            maxOne = 1;
        } else {
            maxZero = 1;
        }

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != lastChar) {
                count = 0;
                lastChar = chars[i];
            }
            if (lastChar == '1') maxOne = Math.max(maxOne, ++count);
            else maxZero = Math.max(maxZero, ++count);
        }

        return maxOne > maxZero;
    }
}
