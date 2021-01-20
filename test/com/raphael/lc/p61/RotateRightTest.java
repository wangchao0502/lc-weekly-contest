package com.raphael.lc.p61;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-20 19:23:40
 */
class RotateRightTest {

    private final RotateRight solution = new RotateRight();

    @Test
    void t1() {
        ListNode input = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode output = ListNode.build(new int[]{4, 5, 1, 2, 3});
        Assertions.assertEquals(output, solution.rotateRight(input, 2));
    }

    @Test
    void t2() {
        ListNode input = ListNode.build(new int[]{1, 2, 3});
        ListNode output = ListNode.build(new int[]{2, 3, 1});
        Assertions.assertEquals(output, solution.rotateRight(input, 2000000000));
    }
}
