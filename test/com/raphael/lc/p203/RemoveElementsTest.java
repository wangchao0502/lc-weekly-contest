package com.raphael.lc.p203;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-21 23:57:21
 */
class RemoveElementsTest {

    private final RemoveElements solution = new RemoveElements();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{1, 1});
        Assertions.assertNull(solution.removeElements(head, 1));
    }

    @Test
    void t2() {
        ListNode head = ListNode.build(new int[]{1, 2, 3});
        ListNode result = ListNode.build(new int[]{1, 3});
        Assertions.assertEquals(result, solution.removeElements(head, 2));
    }
}
