package com.raphael.lc.mst0402;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-27 12:31:06
 */
class SortedArrayToBSTTest {

    private final SortedArrayToBST solution = new SortedArrayToBST();

    @Test
    void t1() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = TreeNode.build("[0,-3,9,-10,null,5]");
        Assertions.assertEquals(root, solution.sortedArrayToBST(nums));
    }
}
