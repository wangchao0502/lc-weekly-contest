package com.raphael.lc.p30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-04 14:07:41
 */
class FindSubstringTest {

    private final FindSubstring solution = new FindSubstring();

    @Test
    void t1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        Assertions.assertEquals(Arrays.asList(0, 9), solution.findSubstring(s, words));
    }

    @Test
    void t2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        Assertions.assertEquals(new ArrayList<>(), solution.findSubstring(s, words));
    }

    @Test
    void t3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        Assertions.assertEquals(Arrays.asList(6, 9, 12), solution.findSubstring(s, words));
    }

    @Test
    void t4() {
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo", "barr", "wing", "ding", "wing"};
        List<Integer> result = new ArrayList<>();
        result.add(13);
        Assertions.assertEquals(result, solution.findSubstring(s, words));
    }
}
