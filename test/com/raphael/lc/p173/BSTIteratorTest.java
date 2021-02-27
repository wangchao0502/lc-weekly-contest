package com.raphael.lc.p173;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-02-26 15:34:28
 */
class BSTIteratorTest {

    @Test
    void t1() {
        TreeNode root = TreeNode.build("[7,3,15,null,null,9,20]");
        BSTIterator iterator = new BSTIterator(root);
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertEquals(7, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(9, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(15, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(20, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
