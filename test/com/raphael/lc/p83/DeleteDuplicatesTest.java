package com.raphael.lc.p83;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-20 19:58:05
 */
class DeleteDuplicatesTest {

    private final DeleteDuplicates solution = new DeleteDuplicates();

    @Test
    void t1() {
        ListNode input = ListNode.build(new int[]{1, 1, 2, 3, 3});
        ListNode output = ListNode.build(new int[]{1, 2, 3});
        Assertions.assertEquals(output, solution.deleteDuplicates(input));
    }
}
