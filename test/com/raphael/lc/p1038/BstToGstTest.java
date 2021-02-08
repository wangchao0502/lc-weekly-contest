package com.raphael.lc.p1038;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-08 16:29:58
 */
class BstToGstTest {

    private final BstToGst solution = new BstToGst();

    @Test
    void t1() {
        TreeNode input = TreeNode.build("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]");
        TreeNode output = TreeNode.build("[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]");
        Assertions.assertEquals(output, solution.bstToGst(input));
    }
}
