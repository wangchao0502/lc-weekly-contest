package com.raphael.lc.weekly226.p5654;

import java.util.HashMap;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-01-31 10:31:47
 */
class CountBalls {
    /**
     * Description for CountBalls:
     * 盒子中小球的最大数量
     */
    public int countBalls(int lowLimit, int higtLimit) {
        // code
        Map<Integer, Integer> map = new HashMap<>(16);
        int n = lowLimit;

        while (n <= higtLimit) {
            int sum = 0;
            int x = n;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            n++;
        }

        int max = Integer.MIN_VALUE;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
