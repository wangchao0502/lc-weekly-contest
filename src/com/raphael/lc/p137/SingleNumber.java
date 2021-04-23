package com.raphael.lc.p137;

/**
 * @author Raphael
 * @date 2021-04-23 10:24:06
 */
class SingleNumber {
    /**
     * Description for SingleNumber:
     * 只出现一次的数字2
     */
    public int singleNumber(int[] nums) {
        // code
        int seenOnce = 0, seenTwice = 0;

        for (int num : nums) {
            // first appearence:
            // add num to seen_once
            // don't add to seen_twice because of presence in seen_once

            // second appearance:
            // remove num from seen_once
            // add num to seen_twice

            // third appearance:
            // don't add to seen_once because of presence in seen_twice
            // remove num from seen_twice
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }
}
