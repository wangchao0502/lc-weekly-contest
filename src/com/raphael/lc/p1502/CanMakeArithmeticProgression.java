package com.raphael.lc.p1502;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-22 11:45:50
 */
class CanMakeArithmeticProgression {
    /**
     * Description for CanMakeArithmeticProgression:
     * 判断能否形成等差数列
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        // code
        Arrays.sort(arr);
        int delta = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != delta) {
                return false;
            }
        }

        return true;
    }
}
