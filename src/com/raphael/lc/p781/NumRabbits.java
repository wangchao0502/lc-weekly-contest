package com.raphael.lc.p781;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-04-04 11:52:41
 */
class NumRabbits {
    /**
     * Description for NumRabbits:
     * 森林中的兔子
     */
    public int numRabbits(int[] answers) {
        // code
        Map<Integer, Integer> count = new HashMap<>(16);
        int ans = 0;

        for (int y : answers) {
            count.put(y, count.getOrDefault(y, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int y = entry.getKey(), x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }

        return ans;
    }
}
