package com.raphael.lc.offer03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-03-08 21:31:10
 */
class FindRepeatNumber {
    /**
     * Description for FindRepeatNumber:
     *
     */
    public int findRepeatNumber(int[] nums) {
        // code
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }

        return 0;
    }
}
