package com.raphael.lc.p636;

import java.util.List;
import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-25 11:17:42
 */
class ExclusiveTime {
    /**
     * Description for ExclusiveTime:
     * 函数的独占时间
     */
    public int[] exclusiveTime(int n, List<String> logs) {
        // code
        int[] ans = new int[n];
        Stack<int[]> stack = new Stack<>();
        Stack<int[]> mid = new Stack<>();

        for (String log : logs) {
            String[] strs = log.split(":");
            int id = Integer.parseInt(strs[0]);
            int st = Integer.parseInt(strs[2]);
            if ("start".equals(strs[1])) {
                stack.push(new int[]{id, st});
            } else {
                int[] record = stack.pop();
                int cost = st - record[1] + 1;
                ans[record[0]] += cost;
                while (!mid.isEmpty() && mid.peek()[0] == id) {
                    ans[record[0]] -= mid.pop()[1];
                }
                if (!stack.isEmpty()) {
                    mid.push(new int[]{stack.peek()[0], cost});
                }
            }
        }

        return ans;
    }
}
