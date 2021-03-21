package com.raphael.lc.weekly233.p5710;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-21 10:35:07
 */
class GetNumberOfBacklogOrdersTest {

    private final GetNumberOfBacklogOrders solution = new GetNumberOfBacklogOrders();

    @Test
    void t1() {
        int[][] orders = {{10, 5, 0}, {15, 2, 1}, {25, 1, 1}, {30, 4, 0}};
        Assertions.assertEquals(6, solution.getNumberOfBacklogOrders(orders));
    }

    @Test
    void t2() {
        int[][] orders = {{7, 1000000000, 1}, {15, 3, 0}, {5, 999999995, 0}, {5, 1, 1}};
        Assertions.assertEquals(999999984, solution.getNumberOfBacklogOrders(orders));
    }

    @Test
    void t3() {
        int[][] orders = {{12, 16, 1}, {28, 4, 0}, {19, 29, 1}, {7, 10, 0}, {29, 26, 0}, {4, 19, 0}, {18, 10, 0}, {3, 17, 1}, {19, 26, 1}};
        Assertions.assertEquals(63, solution.getNumberOfBacklogOrders(orders));
    }
}
