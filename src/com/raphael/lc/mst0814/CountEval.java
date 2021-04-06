package com.raphael.lc.mst0814;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-04-06 10:59:24
 */
class CountEval {
    /**
     * Description for CountEval:
     * 布尔运算
     */
    private int[] countEvalDfs(String s, Map<String, int[]> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        if (s.length() == 1) {
            int[] res = new int[2];
            if (s.charAt(0) == '0') {
                res[0]++;
            } else {
                res[1]++;
            }
            memo.put(s, res);
            return res;
        }
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                continue;
            }
            int[] left = countEvalDfs(s.substring(0, i), memo);
            int[] right = countEvalDfs(s.substring(i + 1), memo);
            if (c == '|') {
                res[0] += left[0] * right[0];
                res[1] += left[1] * right[0] + left[0] * right[1] + left[1] * right[1];
            } else if (c == '^') {
                res[0] += left[0] * right[0] + left[1] * right[1];
                res[1] += left[1] * right[0] + left[0] * right[1];
            } else {
                res[0] += left[0] * right[0] + left[1] * right[0] + left[0] * right[1];
                res[1] += left[1] * right[1];
            }
        }
        memo.put(s, res);
        return res;
    }

    public int countEval(String s, int result) {
        // code
        Map<String, int[]> memo = new HashMap<>(16);
        int[] res = countEvalDfs(s, memo);
        return result == 0 ? res[0] : res[1];
    }
}
