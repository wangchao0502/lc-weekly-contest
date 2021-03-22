package com.raphael.lc.offer62;

/**
 * @author Raphael
 * @date 2021-03-22 13:34:13
 */
class LastRemaining {
    /**
     * Description for LastRemaining:
     * 圆圈中最后剩下的数字
     */
    public int lastRemaining(int n, int m) {
        // code: 约瑟夫环
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            pos = (pos + m) % i;
        }
        return pos;
    }
}
