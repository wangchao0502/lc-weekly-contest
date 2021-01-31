package com.raphael.lc.weekly226.p5665;

import java.util.*;

/**
 * @author raphael
 * @date 2021-01-31 10:41:39
 */
class RestoreArray {
    /**
     * Description for RestoreArray:
     * 从相邻元素对还原数组
     */
    public int[] restoreArray(int[][] adjacentPairs) {
        // code
        int n = adjacentPairs.length;
        Map<Integer, List<Integer>> map = new HashMap<>(16);

        for (int[] pair : adjacentPairs) {
            map.computeIfAbsent(pair[0], o -> new ArrayList<>()).add(pair[1]);
            map.computeIfAbsent(pair[1], o -> new ArrayList<>()).add(pair[0]);
        }

        Set<Integer> numSet = new HashSet<>();
        Deque<Integer> deque = new LinkedList<>();

        while (deque.size() < n + 1) {
            if (deque.size() == 0) {
                int a = adjacentPairs[0][0], b = adjacentPairs[0][1];
                deque.add(a);
                deque.add(b);
                numSet.add(a);
                numSet.add(b);
            } else {
                int left = deque.getFirst();
                int right = deque.getLast();
                for (int leftAdd : map.get(left)) {
                    if (!numSet.contains(leftAdd)) {
                        deque.addFirst(leftAdd);
                        numSet.add(leftAdd);
                        break;
                    }
                }
                for (int rightAdd : map.get(right)) {
                    if (!numSet.contains(rightAdd)) {
                        deque.addLast(rightAdd);
                        numSet.add(rightAdd);
                        break;
                    }
                }
            }
        }

        int[] ans = new int[n + 1];
        int i = 0;
        while (!deque.isEmpty()) {
            ans[i++] = deque.pop();
        }
        return ans;
    }
}
