package com.raphael.lc.p1389;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-24 12:12:05
 */
class CreateTargetArray {
    /**
     * Description for CreateTargetArray:
     * 按既定顺序创建目标数组
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
