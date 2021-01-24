package com.raphael.lc.weekly225.p5662;

/**
 * @author raphael
 * @date 2021-01-24 10:47:35
 */
@SuppressWarnings("AlibabaUndefineMagicConstant")
class MinCharacters {
    /**
     * Description for MinCharacters:
     * 满足三条件之一需改变的最少字符数
     */
    public int makeSmaller(int[] a, int[] b, int ans) {
        for (int i = 1; i < 26; i++) {
            int total = 0;
            for (int j = i; j < 26; j++) {
                total += a[j];
            }
            for (int j = 0; j < i; j++) {
                total += b[j];
            }
            ans = Math.min(ans, total);
        }
        return ans;
    }

    public int minCharacters(String a, String b) {
        // 统计两个字符串字母出现次数
        int[] ca = new int[26];
        int[] cb = new int[26];
        int n = a.length();
        int m = b.length();
        for (char c : a.toCharArray()) {
            ca[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            cb[c - 'a']++;
        }

        int ans = m + n;
        // plan C
        for (int i = 0; i < 26; i++) {
            ans = Math.min(ans, m + n - ca[i] - cb[i]);
        }
        ans = makeSmaller(ca, cb, ans);
        ans = makeSmaller(cb, ca, ans);

        return ans;
    }
}
