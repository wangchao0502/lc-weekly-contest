package com.raphael.lc.p93;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-16 12:27:21
 */
class RestoreIpAddressesTest {

    private final RestoreIpAddresses solution = new RestoreIpAddresses();

    @Test
    void t1() {
        List<String> result = new ArrayList<>();
        result.add("0.0.0.0");
        Assertions.assertEquals(result, solution.restoreIpAddresses("0000"));
    }

    @Test
    void t2() {
        List<String> result = new ArrayList<>();
        result.add("255.255.11.135");
        result.add("255.255.111.35");
        Assertions.assertEquals(result, solution.restoreIpAddresses("25525511135"));
    }

    @Test
    void t3() {
        List<String> result = new ArrayList<>();
        result.add("1.0.10.23");
        result.add("1.0.102.3");
        result.add("10.1.0.23");
        result.add("10.10.2.3");
        result.add("101.0.2.3");
        Assertions.assertEquals(result, solution.restoreIpAddresses("101023"));
    }
}
