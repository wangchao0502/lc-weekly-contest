package com.raphael.lc.p984;

/**
 * @author Raphael
 * @date 2021-04-14 11:34:12
 */
class StrWithout3a3b {
    /**
     * Description for StrWithout3a3b:
     * 不含AAA或BBB的字符串
     */
    public String strWithout3a3b(int a, int b) {
        // code
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char last = ' ';

        while (a + b > 0) {
            if (a > b) {
                if (last == 'a' && count == 2) {
                    sb.append('b');
                    count = 0;
                    b--;
                } else {
                    sb.append('a');
                    count++;
                    a--;
                }
            } else {
                if (last == 'b' && count == 2) {
                    sb.append('a');
                    count = 0;
                    a--;
                } else {
                    sb.append('b');
                    count++;
                    b--;
                }
            }
            last = sb.charAt(sb.length() - 1);
        }


        return sb.toString();
    }
}
