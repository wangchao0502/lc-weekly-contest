package com.raphael.lc.p448;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 12:58:39
 */
class FindDisappearedNumbers {
    /**
     * Description for FindDisappearedNumbers:
     * 找到所有数组中消失的数字
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // code
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int k = i;
            // 记录补位数字，第一个替换的数字用0占位
            int borrow = 0;
            while (k != -1 && nums[k] != k + 1) {
                int tmp = nums[k];
                nums[k] = borrow;
                k = tmp - 1;
                borrow = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
