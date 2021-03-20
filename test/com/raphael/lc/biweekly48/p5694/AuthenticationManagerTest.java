package com.raphael.lc.biweekly48.p5694;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-20 22:43:12
 */
class AuthenticationManagerTest {
    @Test
    void t1() {
        AuthenticationManager obj = new AuthenticationManager(5);
        obj.renew("aaa", 1);
        obj.generate("aaa", 2);
        Assertions.assertEquals(1, obj.countUnexpiredTokens(6));
        obj.generate("bbb", 7);
        obj.renew("aaa", 8);
        obj.renew("bbb", 10);
        Assertions.assertEquals(0, obj.countUnexpiredTokens(15));
    }
}
