package com.raphael.lc.weekly223;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-10 10:42:56
 */
class SwapNodesTest {

    private final SwapNodes solution = new SwapNodes();

    @Test
    void t1() {
        Assertions.assertEquals(
                ListNode.build(new int[]{1, 2, 3}),
                solution.swapNodes(ListNode.build(new int[]{1, 2, 3}), 1));
    }
}
