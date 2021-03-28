package com.raphael.lc.weekly234.p5713;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-03-28 10:31:00
 */
class NumDifferentIntegers {
    /**
     * Description for NumDifferentIntegers:
     * 字符串中不同整数的数目
     */
    private int[] getInteger(char[] chars, int ptr) {
        int num = 0;

        do {
            num = num * 10 + chars[ptr++] - '0';
        } while (ptr < chars.length && Character.isDigit(chars[ptr]));

        return new int[]{num, ptr};
    }

    public int numDifferentIntegers(String word) {
        // code
        Set<Integer> set = new HashSet<>();
        int i = 0;
        char[] chars = word.toCharArray();

        while (i < chars.length) {
            while (i < chars.length && Character.isLetter(chars[i])) {
                i++;
            }
            if (i == chars.length) {
                break;
            }
            int[] ans = getInteger(chars, i);
            set.add(ans[0]);
            i = ans[1];
        }

        return set.size();
    }
}
