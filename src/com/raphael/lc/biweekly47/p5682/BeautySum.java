package com.raphael.lc.biweekly47.p5682;

/**
 * @author Raphael
 * @date 2021-03-06 23:27:39
 */
class BeautySum {
    /**
     * Description for BeautySum:
     * 所有子字符串美丽值之和
     */
    public int beautySum(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int totalSum = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            int[] counts = new int[26];
            for (int j = i; j < chs.length; j++) {
                counts[chs[j] - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                // 26大小，相对来说就是o(1)
                for (int count : counts) {
                    if (count > 0) {
                        max = Math.max(max, count);
                        min = Math.min(min, count);
                    }
                }
                totalSum = totalSum + max - min;
            }
        }
        return totalSum;
    }
}
