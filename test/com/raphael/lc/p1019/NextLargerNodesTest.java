package com.raphael.lc.p1019;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-29 18:47:55
 */
class NextLargerNodesTest {

    private final NextLargerNodes solution = new NextLargerNodes();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{2, 1, 5});
        int[] result = {5, 5, 0};
        Assertions.assertArrayEquals(result, solution.nextLargerNodes(head));
    }

    @Test
    void t2() {
        ListNode head = ListNode.build(new int[]{2, 7, 4, 3, 5});
        int[] result = {7, 0, 5, 5, 0};
        Assertions.assertArrayEquals(result, solution.nextLargerNodes(head));
    }

    @Test
    void t3() {
        ListNode head = ListNode.build(new int[]{1, 7, 5, 1, 9, 2, 5, 1});
        int[] result = {7, 9, 9, 9, 0, 5, 0, 0};
        Assertions.assertArrayEquals(result, solution.nextLargerNodes(head));
    }

    @Test
    void t4() {
        ListNode head = ListNode.build(new int[]{5, 2, 5});
        int[] result = {0, 5, 0};
        Assertions.assertArrayEquals(result, solution.nextLargerNodes(head));
    }

    @Test
    void t5() {
        ListNode head = ListNode.build(new int[]{9, 7, 6, 7, 6, 9});
        int[] result = {0, 9, 7, 9, 9, 0};
        Assertions.assertArrayEquals(result, solution.nextLargerNodes(head));
    }
}
