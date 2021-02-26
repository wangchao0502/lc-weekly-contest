package com.raphael.lc.p1178;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-26 10:02:47
 */
class FindNumOfValidWordsTest {

    private final FindNumOfValidWords solution = new FindNumOfValidWords();

    @Test
    void t1() {
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> result = Arrays.asList(1, 1, 3, 2, 4, 0);
        Assertions.assertEquals(result, solution.findNumOfValidWords(words, puzzles));
    }

    @Test
    void t2() {
        String[] words = {"apple", "pleas", "please"};
        String[] puzzles = {"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"};
        List<Integer> result = Arrays.asList(0, 1, 3, 2, 0);
        Assertions.assertEquals(result, solution.findNumOfValidWords(words, puzzles));
    }
}
