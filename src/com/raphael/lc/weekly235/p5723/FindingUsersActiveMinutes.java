package com.raphael.lc.weekly235.p5723;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-04-04 10:35:42
 */
class FindingUsersActiveMinutes {
    /**
     * Description for FindingUsersActiveMinutes:
     * 查找用户活跃分钟数
     */
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        // code
        Map<Integer, Set<Integer>> map = new HashMap<>(16);
        for (int[] log : logs) {
            Set<Integer> set = map.getOrDefault(log[0], new HashSet<>());
            set.add(log[1]);
            map.put(log[0], set);
        }

        int[] ans = new int[k];
        for (int key : map.keySet()) {
            ans[map.get(key).size() - 1]++;
        }

        return ans;
    }
}
