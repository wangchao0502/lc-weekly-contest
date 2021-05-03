package com.raphael.lc.p109;

import com.raphael.lc.common.ListNode;
import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-03 11:26:05
 */
class SortedListToBSTTest {

    private final SortedListToBST solution = new SortedListToBST();

    @Test
    void t1() {
        ListNode head = ListNode.build(new int[]{-10, -3, 0, 5, 9});
        TreeNode root = TreeNode.build("[0,-3,9,-10,null,5]");
        Assertions.assertEquals(root, solution.sortedListToBST(head));
    }
}
