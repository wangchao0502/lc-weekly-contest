package com.raphael.lc.p82;

import com.raphael.lc.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-20 20:12:58
 */
class DeleteDuplicatesTest {

    private final DeleteDuplicates solution = new DeleteDuplicates();

    @Test
    void t1() {
        ListNode input = ListNode.build(new int[]{1, 1, 2});
        ListNode output = ListNode.build(new int[]{2});
        Assertions.assertEquals(output, solution.deleteDuplicates(input));
    }

    @Test
    void t2() {
        ListNode input = ListNode.build(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode output = ListNode.build(new int[]{1, 2, 5});
        Assertions.assertEquals(output, solution.deleteDuplicates(input));
    }
}
