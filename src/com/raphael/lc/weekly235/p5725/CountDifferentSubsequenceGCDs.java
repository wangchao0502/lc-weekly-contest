package com.raphael.lc.weekly235.p5725;

/**
 * @author Raphael
 * @date 2021-04-04 11:00:21
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming"})
class CountDifferentSubsequenceGCDs {
    /**
     * Description for CountDifferentSubsequenceGCDs:
     * 序列中不同最大公约数的数目
     */
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public int countDifferentSubsequenceGCDs(int[] nums) {
        // code
        boolean[] vis = new boolean[200001];
        for (int x : nums) vis[x] = true;
        int ans = 0;

        for (int i = 1; i <= 200000; i++) {
            int fst = -1;
            for (int j = i; j <= 200000; j += i) {
                if (vis[j]) {
                    if (fst == -1) fst = j;
                    else fst = gcd(fst, j);
                }
            }
            if (fst == i) ans++;
        }

        return ans;
    }
}
