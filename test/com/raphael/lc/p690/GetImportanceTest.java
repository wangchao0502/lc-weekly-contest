package com.raphael.lc.p690;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-01 12:28:12
 */
class GetImportanceTest {

    private final GetImportance solution = new GetImportance();

    @Test
    void t1() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 5, Arrays.asList(2, 3)));
        employees.add(new Employee(2, 3, new ArrayList<>()));
        employees.add(new Employee(3, 3, new ArrayList<>()));
        Assertions.assertEquals(11, solution.getImportance(employees, 1));
    }
}
