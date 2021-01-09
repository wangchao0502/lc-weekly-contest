package com.raphael.lc.p228;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-10 00:13:55
 */
class SummaryRangesTest {

    private final SummaryRanges solution = new SummaryRanges();

    @Test
    void t1() {
        List<String> expect = new ArrayList<>();
        expect.add("0->2");
        expect.add("4->5");
        expect.add("7");
        Assertions.assertEquals(expect, solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    void t2() {
        List<String> expect = new ArrayList<>();
        Assertions.assertEquals(expect, solution.summaryRanges(new int[]{}));
    }
}
