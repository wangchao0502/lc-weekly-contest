package com.raphael.lc.p210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author raphael
 * @date 2021-01-12 16:04:49
 */
class FindOrder {
    /**
     * Description for FindOrder:
     * 现在你总共有 n 门课需要选，记为 0 到 n-1。
     * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
     * 给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。
     * 可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // code
        int[] ans = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        int[] indeg = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // build graph
        for (int[] item : prerequisites) {
            graph.get(item[1]).add(item[0]);
            indeg[item[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }

        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans[index++] = u;
            for (int v : graph.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return index == numCourses ? ans : new int[]{};
    }
}
