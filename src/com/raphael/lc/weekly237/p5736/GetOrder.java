package com.raphael.lc.weekly237.p5736;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-04-18 10:39:31
 */
class GetOrder {
    /**
     * Description for GetOrder:
     * 单线程CPU
     */
    public int[] getOrder(int[][] tasks) {
        // code
        int n = tasks.length;
        int[] ans = new int[n];
        int[][] pairs = new int[n][3];

        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{tasks[i][0], tasks[i][1], i};
        }

        Arrays.sort(pairs, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            }
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            }
            return o1[2] - o2[2];
        });

        // processingTime, index
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            }
            return o1[2] - o2[2];
        });

        int right = 1;
        long rightTime = pairs[0][0] + pairs[0][1];
        int index = 1;
        ans[0] = pairs[0][2];

        while (index < n) {
            // add avaliable task into queue
            while (right < n && pairs[right][0] <= rightTime) {
                queue.offer(pairs[right]);
                right++;
            }
            int[] task = queue.isEmpty() ? pairs[right++] : queue.poll();
            ans[index] = task[2];
            rightTime += task[1];
            index++;
        }

        return ans;
    }
}
