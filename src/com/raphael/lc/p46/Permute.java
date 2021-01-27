package com.raphael.lc.p46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-27 21:15:14
 */
class Permute {
    /**
     * Description for Permute:
     * 全排列
     */
    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if (n == first) {
            res.add(new ArrayList<>(output));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            backtrack(n, output, res, first + 1);
            Collections.swap(output, first, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        // code
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);

        return res;
    }
}
