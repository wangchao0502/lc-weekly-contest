package com.raphael.lc.offer37;

import com.raphael.lc.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-17 11:24:02
 */
class CodecTest {
    @Test
    void t1() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.build("[1,2,3,null,null,4,5]");
        Assertions.assertEquals(root, codec.deserialize(codec.serialize(root)));
    }

    @Test
    void t2() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.build("[1,2]");
        Assertions.assertEquals(root, codec.deserialize(codec.serialize(root)));
    }
}
