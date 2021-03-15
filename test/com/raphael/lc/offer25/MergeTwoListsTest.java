package com.raphael.lc.offer25;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-15 16:30:08
 */
class MergeTwoListsTest {

    private final MergeTwoLists solution = new MergeTwoLists();

    @Test
    void t1() {
        ListNode l1 = ListNode.build(new int[]{1, 2, 4});
        ListNode l2 = ListNode.build(new int[]{1, 3, 4});
        ListNode result = ListNode.build(new int[]{1, 1, 2, 3, 4, 4});
        Assertions.assertEquals(result, solution.mergeTwoLists(l1, l2));
    }
}
