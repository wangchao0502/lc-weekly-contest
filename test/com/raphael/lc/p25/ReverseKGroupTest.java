package com.raphael.lc.p25;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-28 23:45:47
 */
class ReverseKGroupTest {

    private final ReverseKGroup solution = new ReverseKGroup();

    @Test
    void t1() {
        ListNode input = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode output = ListNode.build(new int[]{2, 1, 4, 3, 5});
        Assertions.assertEquals(output, solution.reverseKGroup(input, 2));
    }
}
