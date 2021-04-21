package com.raphael.lc.p1276;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-21 13:18:24
 */
class NumOfBurgersTest {

    private final NumOfBurgers solution = new NumOfBurgers();

    @Test
    void t1() {
        List<Integer> ans = Arrays.asList(1, 6);
        Assertions.assertEquals(ans, solution.numOfBurgers(16, 7));
    }

    @Test
    void t2() {
        List<Integer> ans = new ArrayList<>();
        Assertions.assertEquals(ans, solution.numOfBurgers(17, 4));
    }

    @Test
    void t3() {
        List<Integer> ans = new ArrayList<>();
        Assertions.assertEquals(ans, solution.numOfBurgers(4, 17));
    }

    @Test
    void t4() {
        List<Integer> ans = Arrays.asList(0, 0);
        Assertions.assertEquals(ans, solution.numOfBurgers(0, 0));
    }

    @Test
    void t5() {
        List<Integer> ans = Arrays.asList(0, 1);
        Assertions.assertEquals(ans, solution.numOfBurgers(2, 1));
    }
}
