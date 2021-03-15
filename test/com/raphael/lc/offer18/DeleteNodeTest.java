package com.raphael.lc.offer18;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 11:21:43
 */
class DeleteNodeTest {

    private final DeleteNode solution = new DeleteNode();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{4, 5, 1, 9});
        ListNode ans = ListNode.build(new int[]{4, 1, 9});
        Assertions.assertEquals(ans, solution.deleteNode(head, 5));
    }
}
