package com.raphael.lc.p1202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-11 10:41:23
 */
class SmallestStringWithSwapsTest {

    private final SmallestStringWithSwaps solution = new SmallestStringWithSwaps();

    @Test
    void t1() {
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 3));
        pairs.add(Arrays.asList(1, 2));
        Assertions.assertEquals("bacd", solution.smallestStringWithSwaps("dcab", pairs));
    }

    @Test
    void t2() {
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.asList(0, 3));
        pairs.add(Arrays.asList(1, 2));
        pairs.add(Arrays.asList(0, 2));
        Assertions.assertEquals("abcd", solution.smallestStringWithSwaps("dcab", pairs));
    }
}
