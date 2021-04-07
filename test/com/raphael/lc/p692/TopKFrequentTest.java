package com.raphael.lc.p692;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-07 11:46:52
 */
class TopKFrequentTest {

    private final TopKFrequent solution = new TopKFrequent();

    @Test
    void t1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> ans = Arrays.asList("i", "love");
        Assertions.assertEquals(ans, solution.topKFrequent(words, 2));
    }

    @Test
    void t2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> ans = Arrays.asList("the", "is", "sunny", "day");
        Assertions.assertEquals(ans, solution.topKFrequent(words, 4));
    }
}
