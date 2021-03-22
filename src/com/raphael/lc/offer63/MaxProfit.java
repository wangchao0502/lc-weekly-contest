package com.raphael.lc.offer63;

/**
 * @author Raphael
 * @date 2021-03-22 14:26:04
 */
class MaxProfit {
    /**
     * Description for MaxProfit:
     * 股票的最大利润
     */
    public int maxProfit(int[] prices) {
        // code
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
