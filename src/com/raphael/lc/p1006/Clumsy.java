package com.raphael.lc.p1006;

/**
 * @author Raphael
 * @date 2021-04-01 11:25:50
 */
class Clumsy {
    /**
     * Description for Clumsy:
     * 笨阶乘
     */
    public int clumsy(int n) {
        // code
        int ans = 0;
        boolean isFirst = true;

        for (int i = n; i > 0; i -= 4) {
            int b = i - 1, c = i - 2, d = i - 3;
            int tmp = (isFirst ? 1 : -1) * i * Math.max(b, 1) / Math.max(c, 1) + Math.max(d, 0);
            ans += tmp;
            isFirst = false;
        }

        return ans;
    }
}
