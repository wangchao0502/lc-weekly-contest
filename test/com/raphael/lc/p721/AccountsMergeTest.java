package com.raphael.lc.p721;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-18 10:03:49
 */
class AccountsMergeTest {

    private final AccountsMerge solution = new AccountsMerge();

    @Test
    void t1() {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        List<List<String>> results = new ArrayList<>();
        results.add(Arrays.asList("John", "johnnybravo@mail.com"));
        results.add(Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"));
        results.add(Arrays.asList("Mary", "mary@mail.com"));
        Assertions.assertEquals(results, solution.accountsMerge(accounts));
    }
}
