package com.raphael.lc.p881;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-08 12:27:56
 */
class NumRescueBoats {
    /**
     * Description for NumRescueBoats:
     * 救生艇
     */
    public int numRescueBoats(int[] people, int limit) {
        // code
        Arrays.sort(people);
        int ans = 0, left = 0, right = people.length - 1;

        while (left < right) {
            if (people[left] + people[right] <= limit) {
                left++;
                ans++;
            }
            right--;
        }

        return ans + (people.length - ans * 2);
    }
}
