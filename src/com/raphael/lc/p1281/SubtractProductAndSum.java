package com.raphael.lc.p1281;

/**
 * @author raphael
 * @date 2021-02-03 23:34:04
 */
class SubtractProductAndSum {
    /**
     * Description for SubtractProductAndSum:
     * 整数的各位积和差
     */
    public int subtractProductAndSum(int n) {
        // code
        int sum = 0;
        int product = 1;
        int x = n;

        while (x > 0){
            int a = x %10;
            sum += a;
            product *= a;
            x /= 10;
        }

        return product - sum;
    }
}
