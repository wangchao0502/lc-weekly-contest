package com.raphael.lc.offer10;

/**
 * @author Raphael
 * @date 2021-03-11 10:36:34
 */
class NumWays {
    /**
     * Description for NumWays:
     * 青蛙跳台阶问题
     */
    public int numWays(int n) {
        // code
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }

        return b;
    }
}
