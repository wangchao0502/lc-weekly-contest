package com.raphael.lc.offer23;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 16:10:59
 */
class ReverseListTest {

    private final ReverseList solution = new ReverseList();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode result = ListNode.build(new int[]{5, 4, 3, 2, 1});
        Assertions.assertEquals(result, solution.reverseList(head));
    }
}
