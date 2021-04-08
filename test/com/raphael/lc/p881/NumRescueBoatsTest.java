package com.raphael.lc.p881;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-08 12:27:56
 */
class NumRescueBoatsTest {

    private final NumRescueBoats solution = new NumRescueBoats();

    @Test
    void t1() {
        int[] people = {1, 2};
        Assertions.assertEquals(1, solution.numRescueBoats(people, 3));
    }

    @Test
    void t2() {
        int[] people = {3, 2, 2, 1};
        Assertions.assertEquals(3, solution.numRescueBoats(people, 3));
    }

    @Test
    void t3() {
        int[] people = {3, 5, 3, 4};
        Assertions.assertEquals(4, solution.numRescueBoats(people, 5));
    }
}
