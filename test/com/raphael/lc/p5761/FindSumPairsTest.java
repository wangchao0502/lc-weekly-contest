package com.raphael.lc.p5761;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-16 11:09:54
 */
class FindSumPairsTest {
    @Test
    void t1() {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] nums2 = {1, 4, 5, 2, 5, 4};
        FindSumPairs obj = new FindSumPairs(nums1, nums2);
        Assertions.assertEquals(8, obj.count(7));
        obj.add(3, 2);
        Assertions.assertEquals(2, obj.count(8));
        Assertions.assertEquals(1, obj.count(4));
        obj.add(0, 1);
        obj.add(1, 1);
        Assertions.assertEquals(11, obj.count(7));
    }
}
