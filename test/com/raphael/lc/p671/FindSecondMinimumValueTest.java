package com.raphael.lc.p671;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-15 16:39:45
 */
class FindSecondMinimumValueTest {

    private final FindSecondMinimumValue solution = new FindSecondMinimumValue();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[2,2,5,null,null,5,7]");
        Assertions.assertEquals(5, solution.findSecondMinimumValue(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[2,2,2]");
        Assertions.assertEquals(-1, solution.findSecondMinimumValue(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1]");
        Assertions.assertEquals(2, solution.findSecondMinimumValue(root));
    }
}
