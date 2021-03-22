package com.raphael.lc.offer54;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-22 11:12:48
 */
class KthLargestTest {

    private final KthLargest solution = new KthLargest();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,1,4,null,2]");
        Assertions.assertEquals(4, solution.kthLargest(root, 1));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[5,3,6,2,4,null,null,1]");
        Assertions.assertEquals(4, solution.kthLargest(root, 3));
    }
}
