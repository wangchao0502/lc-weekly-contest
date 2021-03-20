package com.raphael.lc.offer46;

/**
 * @author Raphael
 * @date 2021-03-20 11:14:26
 */
class TranslateNum {
    /**
     * Description for TranslateNum:
     * 把数字翻译成字符串
     */
    public int translateNum(int num) {
        // code
        char[] chars = String.valueOf(num).toCharArray();
        int n = chars.length;
        // 状态压缩后
        int prev = 1;
        int next = 1;

        for (int i = 1; i < n; i++) {
            int x0 = chars[i - 1] - '0';
            int x1 = chars[i] - '0';
            if (x0 != 0 && x0 * 10 + x1 <= 25) {
                int curr = prev + next;
                prev = next;
                next = curr;
            } else {
                prev = next;
            }
        }

        return next;
    }
}
