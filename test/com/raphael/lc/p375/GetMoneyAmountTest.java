package com.raphael.lc.p375;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-04 14:48:30
 */
class GetMoneyAmountTest {

    private final GetMoneyAmount solution = new GetMoneyAmount();

    @Test
    void t1() {
        Assertions.assertEquals(16, solution.getMoneyAmount(10));
    }
}
