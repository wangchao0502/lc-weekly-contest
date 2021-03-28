package com.raphael.lc.weekly234.p5714;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-28 10:52:29
 */
class EvaluateTest {

    private final Evaluate solution = new Evaluate();

    @Test
    void t1() {
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(Arrays.asList("name", "bob"));
        knowledge.add(Arrays.asList("age", "two"));
        Assertions.assertEquals("bobistwoyearsold", solution.evaluate("(name)is(age)yearsold", knowledge));
    }

    @Test
    void t2() {
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(Arrays.asList("a", "b"));
        Assertions.assertEquals("hi?", solution.evaluate("hi(name)", knowledge));
    }

    @Test
    void t3() {
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(Arrays.asList("a", "yes"));
        Assertions.assertEquals("yesyesyesaaa", solution.evaluate("(a)(a)(a)aaa", knowledge));
    }

    @Test
    void t4() {
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(Arrays.asList("a", "b"));
        knowledge.add(Arrays.asList("b", "a"));
        Assertions.assertEquals("ba", solution.evaluate("(a)(b)", knowledge));
    }
}
