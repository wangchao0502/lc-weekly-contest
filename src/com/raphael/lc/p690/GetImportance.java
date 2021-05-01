package com.raphael.lc.p690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-01 12:28:12
 */

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

class GetImportance {
    /**
     * Description for GetImportance:
     * 员工的重要性
     */

    Map<Integer, Employee> map;

    private int dfs(int id, int score) {
        score += map.get(id).importance;

        for (int sid : map.get(id).subordinates) {
            score = dfs(sid, score);
        }

        return score;
    }

    public int getImportance(List<Employee> employees, int id) {
        // code
        map = new HashMap<>(16);
        for (Employee e : employees) {
            map.put(e.id, e);
        }

        return dfs(id, 0);
    }
}
