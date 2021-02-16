package com.raphael.lc.p126;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-16 12:57:44
 */
class FindLaddersTest {

    private final FindLadders solution = new FindLadders();

    @Test
    void t1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> result = new ArrayList<>();
        result.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        result.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        Assertions.assertEquals(result, solution.findLadders(beginWord, endWord, wordList));
    }
}
