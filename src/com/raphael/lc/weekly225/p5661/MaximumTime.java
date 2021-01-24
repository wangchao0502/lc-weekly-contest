package com.raphael.lc.weekly225.p5661;

/**
 * @author raphael
 * @date 2021-01-24 10:36:28
 */
class MaximumTime {
    /**
     * Description for MaximumTime:
     * 替换隐藏数字得到的最晚时间
     */
    public String maximumTime(String time) {
        // code
        char[] chars = time.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                if (i == 0) {
                    if (chars[1] != '?') {
                        if (chars[1] - '0' <= 3) {
                            chars[0] = '2';
                        } else {
                            chars[0] = '1';
                        }
                    } else {
                        chars[0] = '2';
                        chars[1] = '3';
                    }
                } else if (i == 1) {
                    if (chars[0] == '2') {
                        chars[1] = '3';
                    } else {
                        chars[1] = '9';
                    }
                } else if (i == 3) {
                    chars[3] = '5';
                } else if (i == 4) {
                    chars[4] = '9';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
