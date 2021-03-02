package com.raphael.lc.p199;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-26 15:52:33
 */
class RightSideViewTest {

    private final RightSideView solution = new RightSideView();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,null,5,null,4]");
        List<Integer> result = Arrays.asList(1, 3, 4);
        Assertions.assertEquals(result, solution.rightSideView(root));
    }
}
