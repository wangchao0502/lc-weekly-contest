package com.raphael.lc.p1276;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-21 13:18:24
 */
class NumOfBurgers {
    /**
     * Description for NumOfBurgers:
     * 不浪费原料的汉堡制作方案
     */
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // code
        List<Integer> ans = new ArrayList<>();

        if ((4 * cheeseSlices - tomatoSlices) % 2 == 0) {
            int n = (4 * cheeseSlices - tomatoSlices) / 2;
            int m = cheeseSlices - n;

            if (n < 0 || m < 0) {
                return ans;
            }

            ans.add(m);
            ans.add(n);
            return ans;
        }

        return ans;
    }
}
