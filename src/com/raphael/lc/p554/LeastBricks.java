package com.raphael.lc.p554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-02 09:54:48
 */
class LeastBricks {
    /**
     * Description for LeastBricks:
     * 砖墙
     */
    public int leastBricks(List<List<Integer>> wall) {
        // code
        int n = wall.size();
        Map<Integer, Integer> map = new HashMap<>(16);

        for (int i = 0, sum = 0; i < n; i++, sum = 0) {
            for (int cur : wall.get(i)) {
                sum += cur;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            map.remove(sum);
        }

        int ans = n;
        for (int u : map.keySet()) {
            int cnt = map.get(u);
            ans = Math.min(ans, n - cnt);
        }

        return ans;
    }
}
