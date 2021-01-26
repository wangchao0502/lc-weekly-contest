package com.raphael.lc.p1128;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-01-26 20:28:46
 */
class NumEquivDominoPairs {
    /**
     * Description for NumEquivDominoPairs:
     * 等价多米诺骨牌对的数量
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        // code
        Map<Integer, Integer> count = new HashMap<>(16);
        int ans = 0;
        for (int[] domino : dominoes) {
            Arrays.sort(domino);
            int num = 0;
            for (int n : domino) {
                num = num * 10 + n;
            }
            int c = count.getOrDefault(num, 0);
            count.put(num, c + 1);
        }

        for (int n : count.values()) {
            if (n > 1) {
                ans += n * (n - 1) / 2;
            }
        }

        return ans;
    }
}
