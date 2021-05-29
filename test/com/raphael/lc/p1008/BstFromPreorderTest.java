package com.raphael.lc.p1008;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-29 12:41:30
 */
class BstFromPreorderTest {

    private final BstFromPreorder solution = new BstFromPreorder();

    @Test
    void t1() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode ans = TreeNode.build("[8,5,10,1,7,null,12]");
        Assertions.assertEquals(ans, solution.bstFromPreorder(preorder));
    }
}
