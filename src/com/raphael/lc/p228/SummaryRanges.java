package com.raphael.lc.p228;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-10 00:13:55
 */
class SummaryRanges {
    /**
     * Description for SummaryRanges:
     * 给定一个无重复元素的有序整数数组 nums 。
     * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，
     * 并且不存在属于某个范围但不属于 nums 的数字 x 。
     * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
     * "a->b" ，如果 a != b
     * "a" ，如果 a == b
     */
    public List<String> summaryRanges(int[] nums) {
        // code
        List<String> ans = new ArrayList<>();
        int len = nums.length;
        int start = 0;

        if (len == 0) {
            return ans;
        }

        for (int i = 1; i < len; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (i - 1 != start) {
                    ans.add(nums[start] + "->" + nums[i - 1]);
                } else {
                    ans.add(String.valueOf(nums[start]));
                }
                start = i;
            }
        }

        if (start == len - 1) {
            ans.add(String.valueOf(nums[len - 1]));
        } else {
            ans.add(nums[start] + "->" + nums[len - 1]);
        }

        return ans;
    }
}
