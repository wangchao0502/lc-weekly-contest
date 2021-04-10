package com.raphael.lc.p955;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-04-10 10:51:05
 */
class MinDeletionSize {
    /**
     * Description for MinDeletionSize:
     * 删列造序2
     */
    public int minDeletionSize(String[] strs) {
        // code
        int ans = 0;
        int n = strs.length;
        Queue<int[]> scanQueue = new LinkedList<>();
        scanQueue.offer(new int[]{0, n});

        for (int i = 0; i < strs[0].length(); i++) {
            boolean isNaturalOrder = true;
            boolean hasEqual = false;
            int count = scanQueue.size();
            Queue<int[]> oldQueue = new LinkedList<>();
            Queue<int[]> newQueue = new LinkedList<>();
            while (!scanQueue.isEmpty() && isNaturalOrder) {
                int[] scanIdx = scanQueue.poll();
                int left = -1, right = -1;
                oldQueue.offer(scanIdx);
                for (int j = scanIdx[0] + 1; j < scanIdx[1]; j++) {
                    char a = strs[j].charAt(i);
                    char b = strs[j - 1].charAt(i);
                    if (a < b) {
                        // 恢复重复区间，下次计算
                        isNaturalOrder = false;
                        break;
                    }
                    if (a == b) {
                        hasEqual = true;
                        if (left == -1) left = j - 1;
                        right = j;
                    } else if (right != left) {
                        newQueue.offer(new int[]{left, right + 1});
                        left = -1;
                        right = -1;
                    }
                }
                if (right != left) {
                    newQueue.offer(new int[]{left, right + 1});
                }
            }
            if (isNaturalOrder && !hasEqual) {
                break;
            }
            if (!isNaturalOrder) {
                while (!oldQueue.isEmpty()) scanQueue.offer(oldQueue.poll());
                ans++;
            } else {
                while (!newQueue.isEmpty()) scanQueue.offer(newQueue.poll());
            }
        }

        return ans;
    }
}
