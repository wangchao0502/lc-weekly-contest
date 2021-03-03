package com.raphael.lc.p338;

/**
 * @author Raphael
 * @date 2021-03-03 09:57:29
 */
class CountBits {
    /**
     * Description for CountBits:
     * 比特位统计
     */
    int[] ans;

    private void backtracking(int n, int target, int oneCount) {
        if (n <= target && ans[n] == 0) {
            ans[n] = oneCount;
        }
        if (n > target) {
            return;
        }
        backtracking(n << 1, target, oneCount);
        backtracking((n << 1) + 1, target, oneCount + 1);
    }

    public int[] countBits(int num) {
        // code
        ans = new int[num + 1];
        ans[0] = 0;
        backtracking(1, num, 1);
        return ans;
    }
}
