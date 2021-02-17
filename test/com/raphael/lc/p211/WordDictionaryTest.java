package com.raphael.lc.p211;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-17 12:50:47
 */
class WordDictionaryTest {
    @Test
    void t1() {
        WordDictionary solution = new WordDictionary();
        solution.addWord("bad");
        solution.addWord("dad");
        solution.addWord("mad");
        Assertions.assertFalse(solution.search("pad"));
        Assertions.assertTrue(solution.search("bad"));
        Assertions.assertTrue(solution.search(".ad"));
        Assertions.assertTrue(solution.search("b.."));
    }
}
