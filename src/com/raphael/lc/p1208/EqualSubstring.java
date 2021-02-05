package com.raphael.lc.p1208;

/**
 * @author raphael
 * @date 2021-02-05 09:31:22
 */
class EqualSubstring {
    /**
     * Description for EqualSubstring:
     * 尽可能使字符串相等
     */
    public int equalSubstring(String s, String t, int maxCost) {
        // code
        int n = s.length();
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int left = 0, right = 0;
        int maxLength = 0;
        int cost = 0;

        while (right < n) {
            cost += diff[right++];

            if (cost <= maxCost) {
                maxLength = Math.max(maxLength, right - left);
            } else {
                // 缩小左边界
                while (cost > maxCost && left < right) {
                    cost -= diff[left++];
                }
            }
        }

        return maxLength;
    }
}
