package com.raphael.lc.mst0403;

import com.raphael.lc.common.ListNode;
import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-27 16:48:08
 */
class ListOfDepthTest {

    private final ListOfDepth solution = new ListOfDepth();

    @Test
    void t1() {
        TreeNode tree = TreeNode.build("[1,2,3,4,5,null,7,8]");
        ListNode[] result = {
                ListNode.build(new int[]{1}),
                ListNode.build(new int[]{2, 3}),
                ListNode.build(new int[]{4, 5, 7}),
                ListNode.build(new int[]{8}),
        };
        Assertions.assertArrayEquals(result, solution.listOfDepth(tree));
    }
}
