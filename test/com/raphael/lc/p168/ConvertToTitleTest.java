package com.raphael.lc.p168;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-02 08:30:05
 */
class ConvertToTitleTest {

    private final ConvertToTitle solution = new ConvertToTitle();

    @Test
    void t1() {
        Assertions.assertEquals("A", solution.convertToTitle(1));
        Assertions.assertEquals("B", solution.convertToTitle(2));
        Assertions.assertEquals("AB", solution.convertToTitle(28));
        Assertions.assertEquals("ZY", solution.convertToTitle(701));
        Assertions.assertEquals("Z", solution.convertToTitle(26));
    }
}
