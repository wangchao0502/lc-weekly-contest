package com.raphael.lc.offer22;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 16:06:11
 */
class GetKthFromEndTest {

    private final GetKthFromEnd solution = new GetKthFromEnd();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode result = ListNode.build(new int[]{4, 5});
        Assertions.assertEquals(result, solution.getKthFromEnd(head, 2));
    }
}
