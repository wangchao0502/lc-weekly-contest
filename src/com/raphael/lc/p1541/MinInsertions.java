package com.raphael.lc.p1541;

/**
 * @author Raphael
 * @date 2021-04-03 13:20:22
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class MinInsertions {
    /**
     * Description for MinInsertions:
     * 平衡括号字符串的最少插入次数
     */
    public int minInsertions(String s) {
        // code
        int insertions = 0;
        int leftCount = 0;
        int length = s.length();
        int index = 0;
        while (index < length) {
            char c = s.charAt(index);
            if (c == '(') {
                leftCount++;
                index++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    insertions++;
                }
                if (index < length - 1 && s.charAt(index + 1) == ')') {
                    index += 2;
                } else {
                    insertions++;
                    index++;
                }
            }
        }
        insertions += leftCount * 2;
        return insertions;
    }
}
