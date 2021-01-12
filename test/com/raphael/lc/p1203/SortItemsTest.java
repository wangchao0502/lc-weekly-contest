package com.raphael.lc.p1203;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-12 11:17:46
 */
class SortItemsTest {

    private final SortItems solution = new SortItems();

    @Test
    void t1() {
        int[] group = new int[]{-1, -1, 1, 0, 0, 1, 0, -1};
        // [[],[6],[5],[6],[3,6],[],[],[]]
        List<List<Integer>> beforeItems = new ArrayList<>();
        beforeItems.add(Collections.emptyList());
        beforeItems.add(Collections.singletonList(6));
        beforeItems.add(Collections.singletonList(5));
        beforeItems.add(Collections.singletonList(6));
        beforeItems.add(Arrays.asList(3, 6));
        beforeItems.add(Collections.emptyList());
        beforeItems.add(Collections.emptyList());
        beforeItems.add(Collections.emptyList());
        int[] result = new int[]{6, 3, 4, 5, 2, 0, 7, 1};
        Assertions.assertArrayEquals(result, solution.sortItems(8, 2, group, beforeItems));
    }
}
