package com.raphael.lc.p1441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-02 12:20:33
 */
class BuildArrayTest {

    private final BuildArray solution = new BuildArray();

    @Test
    void t1() {
        int[] target = {1, 3};
        List<String> result = new ArrayList<>();
        result.add("Push");
        result.add("Push");
        result.add("Pop");
        result.add("Push");
        Assertions.assertEquals(result, solution.buildArray(target, 3));
    }

    @Test
    void t2() {
        int[] target = {1, 2, 3};
        List<String> result = new ArrayList<>();
        result.add("Push");
        result.add("Push");
        result.add("Push");
        Assertions.assertEquals(result, solution.buildArray(target, 3));
    }

    @Test
    void t3() {
        int[] target = {1, 2};
        List<String> result = new ArrayList<>();
        result.add("Push");
        result.add("Push");
        Assertions.assertEquals(result, solution.buildArray(target, 4));
    }

    @Test
    void t4() {
        int[] target = {2, 3, 4};
        List<String> result = new ArrayList<>();
        result.add("Push");
        result.add("Pop");
        result.add("Push");
        result.add("Push");
        result.add("Push");
        Assertions.assertEquals(result, solution.buildArray(target, 4));
    }
}
