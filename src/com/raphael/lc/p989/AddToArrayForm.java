package com.raphael.lc.p989;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-22 00:47:10
 */
class AddToArrayForm {
    /**
     * Description for AddToArrayForm:
     * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
     * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
     */
    public List<Integer> addToArrayForm(int[] nums, int k) {
        // code
        List<Integer> ans = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = nums[i] + k % 10;
            k /= 10;
            if (sum >= 10) {
                k++;
                sum -= 10;
            }
            ans.add(sum);
        }
        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
