package com.raphael.lc.weekly232.p5701;

/**
 * @author Raphael
 * @date 2021-03-14 10:32:12
 */
class AreAlmostEqual {
    /**
     * Description for AreAlmostEqual:
     * 仅执行一次字符串交换能否使两个字符串相等
     */
    public boolean areAlmostEqual(String s1, String s2) {
        // code
        int n = s1.length();
        int count = 0;
        int swapIdx = -1;
        int ptr = 0;

        while (ptr < n) {
            char c1 = s1.charAt(ptr);
            char c2 = s2.charAt(ptr);
            if (c1 != c2) {
                if (count > 0) return false;
                if (swapIdx != -1) {
                    if (c2 == s1.charAt(swapIdx) && c1 == s2.charAt(swapIdx)) {
                        count++;
                        swapIdx = -1;
                    } else {
                        return false;
                    }
                } else {
                    swapIdx = ptr;
                }
            }
            ptr++;
        }

        return swapIdx == -1;
    }
}
