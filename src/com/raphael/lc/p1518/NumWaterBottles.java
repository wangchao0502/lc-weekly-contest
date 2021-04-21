package com.raphael.lc.p1518;

/**
 * @author Raphael
 * @date 2021-04-21 13:28:27
 */
class NumWaterBottles {
    /**
     * Description for NumWaterBottles:
     * 换酒问题
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        // code
        int ans = numBottles;
        int rest = numBottles;

        while (rest >= numExchange) {
            ans += rest / numExchange;
            rest = rest / numExchange + rest % numExchange;
        }

        return ans;
    }
}
