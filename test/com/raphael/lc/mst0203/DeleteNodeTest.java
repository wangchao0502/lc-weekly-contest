package com.raphael.lc.mst0203;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-16 14:50:05
 */
class DeleteNodeTest {

    private final DeleteNode solution = new DeleteNode();

    @Test
    void t1() {
        ListNode node = ListNode.build(new int[]{1, 2, 3, 4, 5, 6});
        solution.deleteNode(node);
        ListNode result = ListNode.build(new int[]{1, 2, 4, 5, 6});
        Assertions.assertEquals(result, node);
    }

    @Test
    void t2() {
        ListNode node = ListNode.build(new int[]{4, 5, 1, 9});
        solution.deleteNode(node);
        ListNode result = ListNode.build(new int[]{4, 1, 9});
        Assertions.assertEquals(result, node);
    }
}
