package com.raphael.lc.p502;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-04-13 15:53:14
 */
class FindMaximizedCapital {
    /**
     * Description for FindMaximizedCapital:
     * IPO
     */
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // code
        int n = profits.length;
        PriorityQueue<int[]> projects = new PriorityQueue<>(Comparator.comparingInt(x -> x[0]));

        for (int i = 0; i < n; i++) {
            projects.add(new int[]{capital[i], profits[i]});
        }

        PriorityQueue<Integer> avaliable = new PriorityQueue<>(Comparator.reverseOrder());

        while (k > 0) {
            while (!projects.isEmpty() && projects.peek()[0] <= w) {
                avaliable.offer(projects.poll()[1]);
            }
            if (avaliable.isEmpty()) {
                break;
            } else {
                w += avaliable.poll();
            }
            k--;
        }

        return w;
    }
}
