package com.raphael.lc.biweekly47.p5682;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-06 23:27:39
 */
class BeautySumTest {

    private final BeautySum solution = new BeautySum();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.beautySum("aabcb"));
    }
}
