package com.raphael.lc.p354;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-04 09:51:28
 */
class MaxEnvelopes {
    /**
     * Description for MaxEnvelopes:
     * 俄罗斯套娃信封问题
     */
    public int maxEnvelopes(int[][] envelopes) {
        // code
        int n = envelopes.length;
        if (n == 0) return 0;

        // 根据信封宽度排序
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o2[1] - o1[1];
            }
        });

        List<Integer> f = new ArrayList<Integer>();
        f.add(envelopes[0][1]);
        for (int i = 1; i < n; i++) {
            int num = envelopes[i][1];
            // 二分查找优化，最靠近当前信封体积的信封一定最大
            if (num > f.get(f.size() - 1)) {
                f.add(num);
            } else {
                int left = 0, right = f.size();
                while (left < right) {
                    int mid = left + ((right - left) >> 1);
                    if (f.get(mid) < num) left = mid + 1;
                    else right = mid;
                }
                f.set(left, num);
            }
        }

        return f.size();
    }
}
