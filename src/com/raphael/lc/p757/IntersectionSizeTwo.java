package com.raphael.lc.p757;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-19 11:12:45
 */
class IntersectionSizeTwo {
    /**
     * Description for IntersectionSizeTwo:
     * 设置交集大小至少为2
     */
    public int intersectionSizeTwo(int[][] intervals) {
        // code
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int n = intervals.length;
        int[] todo = new int[n];
        // can change to k, but must check right bound in for loop
        Arrays.fill(todo, 2);

        int ans = 0;

        while (--n >= 0) {
            for (int i = intervals[n][0]; i < intervals[n][0] + todo[n]; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    if (intervals[j][1] >= i) {
                        if (intervals[j][0] <= i) todo[j]--;
                    } else {
                        break;
                    }
                }
                ans++;
            }
        }

        return ans;
    }
}
