package com.raphael.lc.biweekly47.p5681;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-06 22:40:54
 */
class CheckPowersOfThree {
    /**
     * Description for CheckPowersOfThree:
     * 判断一个数字是否可以表示成3的幂的和
     */
    public boolean checkPowersOfThree(int n) {
        List<Integer> threes = new ArrayList<>();
        int x = 1;
        while (x <= n) {
            threes.add(x);
            x *= 3;
        }

        for (int i = threes.size() - 1; i >= 0; i--) {
            if (n >= threes.get(i)) {
                n -= threes.get(i);
            }
        }

        return n == 0;
    }
}
