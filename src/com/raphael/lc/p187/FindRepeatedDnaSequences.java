package com.raphael.lc.p187;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-04-23 10:32:56
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class FindRepeatedDnaSequences {
    /**
     * Description for FindRepeatedDnaSequences:
     * 重复的DNA序列
     */
    public List<String> findRepeatedDnaSequences(String s) {
        // code
        int L = 10, n = s.length();
        if (n <= L) return new ArrayList<>();

        // convert string to array of integers
        Map<Character, Integer> toInt = new
                HashMap<Character, Integer>(16) {{
                    put('A', 0);
                    put('C', 1);
                    put('G', 2);
                    put('T', 3);
                }};

        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) nums[i] = toInt.get(s.charAt(i));

        int bitmask = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();
        // iterate over all sequences of length L
        for (int start = 0; start < n - L + 1; ++start) {
            // compute bitmask of the current sequence in O(1) time
            if (start != 0) {
                // left shift to free the last 2 bit
                bitmask <<= 2;
                // add a new 2-bits number in the last two bits
                bitmask |= nums[start + L - 1];
                // unset first two bits: 2L-bit and (2L + 1)-bit
                bitmask &= ~(3 << 2 * L);
            } else {
                for (int i = 0; i < L; ++i) {
                    bitmask <<= 2;
                    bitmask |= nums[i];
                }
            }
            // update output and hashset of seen sequences
            if (seen.contains(bitmask)) output.add(s.substring(start, start + L));
            seen.add(bitmask);
        }
        return new ArrayList<>(output);
    }
}
