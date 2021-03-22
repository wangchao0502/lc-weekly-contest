package com.raphael.lc.offer60;

/**
 * @author Raphael
 * @date 2021-03-22 12:51:47
 */
class DicesProbability {
    /**
     * Description for DicesProbability:
     * n个骰子的点数
     */
    public double[] dicesProbability(int n) {
        // code
        double[] pre = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double[] tmp = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] += pre[j] / 6;
                }
            }
            pre = tmp;
        }
        return pre;
    }
}
