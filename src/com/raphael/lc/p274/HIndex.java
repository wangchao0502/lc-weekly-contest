package com.raphael.lc.p274;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-22 11:37:40
 */
class HIndex {
    /**
     * Description for HIndex:
     * H指数
     */
    public int hIndex(int[] citations) {
        // code
        int n = citations.length;
        Arrays.sort(citations);
        int h = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] > h) {
                h++;
            }
        }

        return h;
    }
}
