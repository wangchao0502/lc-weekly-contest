package com.raphael.lc.p77;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 15:40:46
 */
class CombineTest {

    private final Combine solution = new Combine();

    @Test
    void t1() {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1, 2));
        ans.add(Arrays.asList(1, 3));
        ans.add(Arrays.asList(1, 4));
        ans.add(Arrays.asList(2, 3));
        ans.add(Arrays.asList(2, 4));
        ans.add(Arrays.asList(3, 4));
        Assertions.assertEquals(ans, solution.combine(4, 2));
    }
}
