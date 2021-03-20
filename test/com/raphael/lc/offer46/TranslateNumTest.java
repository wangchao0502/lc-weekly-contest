package com.raphael.lc.offer46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 11:14:26
 */
class TranslateNumTest {

    private final TranslateNum solution = new TranslateNum();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.translateNum(12258));
    }
}
