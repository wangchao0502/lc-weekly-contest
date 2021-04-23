package com.raphael.lc.p187;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-23 10:32:56
 */
class FindRepeatedDnaSequencesTest {

    private final FindRepeatedDnaSequences solution = new FindRepeatedDnaSequences();

    @Test
    void t1() {
        List<String> ans = new ArrayList<>();
        ans.add("AAAAACCCCC");
        ans.add("CCCCCAAAAA");
        Assertions.assertEquals(ans, solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    @Test
    void t2() {
        List<String> ans = new ArrayList<>();
        ans.add("AAAAAAAAAA");
        Assertions.assertEquals(ans, solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
}
