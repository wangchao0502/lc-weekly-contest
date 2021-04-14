package com.raphael.lc.p991;

/**
 * @author Raphael
 * @date 2021-04-14 11:59:29
 */
class BrokenCalc {
    /**
     * Description for BrokenCalc:
     * 怀了的计算器
     */
    public int brokenCalc(int x, int y) {
        // code
        int ans = 0;

        while (y > x) {
            ans++;
            if (y % 2 == 1)
                y++;
            else
                y /= 2;
        }

        return ans + x - y;
    }
}
