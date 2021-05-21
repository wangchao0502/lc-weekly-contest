package com.raphael.lc.p951;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-21 14:15:43
 */
class FlipEquivTest {

    private final FlipEquiv solution = new FlipEquiv();

    @Test
    void t1() {
        TreeNode root1 = TreeNode.build("[1,2,3,4,5,6,null,null,null,7,8]");
        TreeNode root2 = TreeNode.build("[1,3,2,null,6,4,5,null,null,null,null,8,7]");
        Assertions.assertTrue(solution.flipEquiv(root1, root2));
    }
}
