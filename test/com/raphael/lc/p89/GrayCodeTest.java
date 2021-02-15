package com.raphael.lc.p89;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-15 15:41:50
 */
class GrayCodeTest {

    private final GrayCode solution = new GrayCode();

    @Test
    void t1() {
        List<Integer> result = Arrays.asList(0, 1, 3, 2);
        Assertions.assertEquals(result, solution.grayCode(2));
    }

    @Test
    void t2() {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        Assertions.assertEquals(result, solution.grayCode(0));
    }

    @Test
    void t3() {
        List<Integer> result = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        Assertions.assertEquals(result, solution.grayCode(3));
    }
}
