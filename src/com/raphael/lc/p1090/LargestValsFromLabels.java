package com.raphael.lc.p1090;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-04-15 12:03:56
 */
class LargestValsFromLabels {
    /**
     * Description for LargestValsFromLabels:
     * 受标签影响的最大值
     */
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        // code
        int n = values.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{values[i], labels[i]};
        }

        Arrays.sort(pairs, (x, y) -> y[0] - x[0]);

        int ans = 0;
        int k = 0;
        Map<Integer, Integer> useCount = new HashMap<>(16);

        for (int[] pair : pairs) {
            int count = useCount.getOrDefault(pair[1], 0);
            if (count < useLimit) {
                ans += pair[0];
                k++;
                if (k == numWanted) {
                    break;
                }
                useCount.put(pair[1], count + 1);
            }
        }

        return ans;
    }
}
