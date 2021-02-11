package com.raphael.lc.p56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-11 11:16:46
 */
class Merge {
    /**
     * Description for Merge:
     *
     */
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public int[][] merge(int[][] intervals) {
        // code
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            int L = interval[0], R = interval[1];
            if (ans.size() == 0 || ans.get(ans.size() - 1)[1] < L) {
                ans.add(new int[]{L, R});
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], R);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
