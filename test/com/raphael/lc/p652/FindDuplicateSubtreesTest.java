package com.raphael.lc.p652;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-13 13:41:32
 */
class FindDuplicateSubtreesTest {

    private final FindDuplicateSubtrees solution = new FindDuplicateSubtrees();

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[1,2,3,4,null,2,4,null,null,4]");
        List<TreeNode> ans = new ArrayList<>();
        ans.add(TreeNode.build("[4]"));
        ans.add(TreeNode.build("[2,4]"));
        Assertions.assertEquals(ans, solution.findDuplicateSubtrees(root));
    }
}
