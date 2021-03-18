package com.raphael.lc.p92;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-18 10:42:32
 */
class ReverseBetweenTest {

    private final ReverseBetween solution = new ReverseBetween();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode result = ListNode.build(new int[]{1, 4, 3, 2, 5});
        Assertions.assertEquals(result, solution.reverseBetween(head, 2, 4));
    }

    @Test
    void t2() {
        ListNode head = ListNode.build(new int[]{5});
        ListNode result = ListNode.build(new int[]{5});
        Assertions.assertEquals(result, solution.reverseBetween(head, 1, 1));
    }

    @Test
    void t3() {
        ListNode head = ListNode.build(new int[]{3, 5});
        ListNode result = ListNode.build(new int[]{5, 3});
        Assertions.assertEquals(result, solution.reverseBetween(head, 1, 2));
    }
}
