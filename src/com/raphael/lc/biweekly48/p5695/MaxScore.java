package com.raphael.lc.biweekly48.p5695;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-20 23:13:58
 */
class MaxScore {
    /**
     * Description for MaxScore:
     * N次操作后的最大分数和
     */

    int ans = 0;

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    private void backtracking(List<int[]> pairs, int n, int[][] record, boolean[] visited, int[] nums, int[] gcds) {
        int[] pair = pairs.get(pairs.size() - 1);
        int a = pair[0];
        int b = pair[1];
        if (record[a][b] == 0) {
            record[a][b] = gcd(nums[a], nums[b]);
            record[b][a] = record[a][b];
        }

        gcds[pairs.size() - 1] = record[a][b];

        if (pairs.size() == n) {
            int[] copy = new int[n];
            System.arraycopy(gcds, 0, copy, 0, n);
            Arrays.sort(copy);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (i + 1) * copy[i];
            }
            ans = Math.max(ans, sum);
            return;
        }

        for (int i = 1; i < n * 2; i++) {
            if (!visited[i]) {
                visited[i] = true;
                for (int j = 1; j < n * 2; j++) {
                    if (!visited[j]) {
                        visited[j] = true;
                        int[] newPair = {i, j};
                        pairs.add(newPair);
                        backtracking(pairs, n, record, visited, nums, gcds);
                        pairs.remove(pairs.size() - 1);
                        visited[j] = false;
                    }
                }
                visited[i] = false;
            }
        }
    }

    public int maxScore(int[] nums) {
        // code
        int len = nums.length;
        int n = len / 2;
        // 分成n组的gcd排序
        int[][] record = new int[len][len];
        boolean[] visited = new boolean[len];
        // 记录数字下标
        List<int[]> pairs = new ArrayList<>();
        visited[0] = true;

        for (int i = 1; i < len; i++) {
            int[] gcds = new int[n];
            int[] pair = {0, i};
            pairs.add(pair);
            visited[i] = true;
            backtracking(pairs, n, record, visited, nums, gcds);
            visited[i] = false;
            pairs.remove(pairs.size() - 1);
        }

        return ans;
    }
}
