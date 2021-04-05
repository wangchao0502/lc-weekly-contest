package com.raphael.lc.p1598;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-05 10:46:15
 */
class MinOperationsTest {

    private final MinOperations solution = new MinOperations();

    @Test
    void t1() {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        Assertions.assertEquals(2, solution.minOperations(logs));
    }

    @Test
    void t2() {
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        Assertions.assertEquals(3, solution.minOperations(logs));
    }

    @Test
    void t3() {
        String[] logs = {"d1/","../", "../", "../"};
        Assertions.assertEquals(0, solution.minOperations(logs));
    }
}
