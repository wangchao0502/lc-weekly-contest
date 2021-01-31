package com.raphael.lc.tpl;

/**
 * @author raphael
 * @date 2021-01-31 23:49:28
 */
@SuppressWarnings("AliControlFlowStatementWithoutBraces")
class QuickPower {
    /**
     * Description for QuickPower:
     * 快速幂
     */
    public int quickPower(int x, int n) {
        // code
        int res = 1;
        while (n > 0) {
            if ((n & 1) == 1) res *= x;
            x *= x;
            n >>= 1;
        }
        return res;
    }
}
