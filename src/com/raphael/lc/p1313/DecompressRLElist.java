package com.raphael.lc.p1313;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-25 12:51:31
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class DecompressRLElist {
    /**
     * Description for DecompressRLElist:
     * 解压缩编码列表
     */
    public int[] decompressRLElist(int[] nums) {
        // code
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
