package com.raphael.lc.p876;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-22 00:15:36
 */
class MiddleNodeTest {

    private final MiddleNode solution = new MiddleNode();

    @Test
    void t1() {
        ListNode input = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode output = ListNode.build(new int[]{3, 4, 5});
        Assertions.assertEquals(output, solution.middleNode(input));
    }
}
