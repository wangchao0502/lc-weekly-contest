package com.raphael.lc.weekly223;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-10 11:07:57
 */
class MinimumTimeRequired {
    /**
     * Description for MinimumTimeRequired:
     * 给你一个整数数组 jobs ，其中 jobs[i] 是完成第 i 项工作要花费的时间。
     * 请你将这些工作分配给 k 位工人。每项工作只能分配给一位工人。工人的 工作时间 是完成分配给他们的所有工作花费时间的总和。请你设计一套最佳的工作分配方案，使任何一位工人的 最大工作时间 得以 最小化 。
     * 返回分配方案中尽可能 最小 的 最大工作时间 。
     */
    public int minimumTimeRequired(int[] jobs, int k) {
        // code
        // 状压dp
        int len = jobs.length;
        int[][] dp = new int[k + 1][1 << len];

        for (int i = 0; i <= k; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }

        dp[0][0] = 0;
        int[] sum = new int[1 << len];
        // 取i bit对应位的时间和，方便计算
        // 例如：jobs=[1,2,4,7,8], 00111->[1,2,4](下标顺序是反的), sum[7]=7
        for (int i = 0; i < (1 << len); i++) {
            for (int j = 0; j < len; j++) {
                if (((i >> j) & 1) > 0) {
                    sum[i] += jobs[j];
                }
            }
        }
        // dp[i][S]: 分给i个工人，S集合对应天数工作总和的最优解
        // dp[i - 1][S ^ ns]: 其他工人干剩余的活的最优解
        for (int i = 1; i <= k; i++) {
            for (int s = 0; s < (1 << len); s++) {
                for (int ns = s; ns > 0; ns = (ns - 1) & s) {
                    dp[i][s] = Math.min(dp[i][s], Math.max(dp[i - 1][s ^ ns], sum[ns]));
                }
            }
        }
        return dp[k][(1 << len) - 1];
    }
}
