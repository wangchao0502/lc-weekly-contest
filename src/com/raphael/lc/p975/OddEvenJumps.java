package com.raphael.lc.p975;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Raphael
 * @date 2021-04-06 12:13:59
 */
class OddEvenJumps {
    /**
     * Description for OddEvenJumps:
     * 奇偶跳
     */
    public int oddEvenJumps(int[] arr) {
        // code
        int n = arr.length, ans = 1;
        TreeMap<Integer, Boolean> oddJump = new TreeMap<>((a, b) -> b - a);
        TreeMap<Integer, Boolean> evenJump = new TreeMap<>(Comparator.comparingInt(a -> a));

        oddJump.put(arr[n - 1], true);
        evenJump.put(arr[n - 1], true);

        for (int i = n - 2; i >= 0; i--) {
            Integer larger = evenJump.ceilingKey(arr[i]);
            Integer smaller = oddJump.ceilingKey(arr[i]);

            boolean oddJumpGood = larger != null && evenJump.get(larger);
            boolean evenJumpGood = smaller != null && oddJump.get(smaller);

            oddJump.put(arr[i], oddJumpGood);
            evenJump.put(arr[i], evenJumpGood);

            if (oddJump.get(arr[i])) ans++;
        }

        return ans;
    }
}
