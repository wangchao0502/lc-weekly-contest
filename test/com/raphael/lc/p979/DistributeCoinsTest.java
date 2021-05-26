package com.raphael.lc.p979;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-26 10:12:41
 */
class DistributeCoinsTest {

    private final DistributeCoins solution = new DistributeCoins();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[3,0,0]");
        Assertions.assertEquals(2, solution.distributeCoins(root));
    }

    @Test
    void t2() {
        TreeNode root = TreeNode.build("[0,3,0]");
        Assertions.assertEquals(3, solution.distributeCoins(root));
    }

    @Test
    void t3() {
        TreeNode root = TreeNode.build("[1,0,2]");
        Assertions.assertEquals(2, solution.distributeCoins(root));
    }

    @Test
    void t4() {
        TreeNode root = TreeNode.build("[1,0,0,null,3]");
        Assertions.assertEquals(4, solution.distributeCoins(root));
    }
}
