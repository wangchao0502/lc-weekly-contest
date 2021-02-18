package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-01-31 23:43:40
 */
class QuickPowerMod {
    /**
     * Description for QuickPowerMod:
     * 快速幂取余
     */
    public int quickPowerMod(int x, int n, int m) {
        // code
        int res = 1;
        while (n > 0) {
            if ((n & 1) == 1) res = res * x % m;
            x = x * x % m;
            n >>= 1;
        }
        return res;
    }
}
