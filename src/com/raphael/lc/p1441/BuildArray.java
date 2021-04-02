package com.raphael.lc.p1441;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-02 12:20:33
 */
class BuildArray {
    /**
     * Description for BuildArray:
     * 用栈操作构建数组
     */
    public List<String> buildArray(int[] target, int n) {
        // code
        List<String> ans = new ArrayList<>();
        int curr = 1;
        int i = 0;

        while (curr <= n && i < target.length) {
            if (curr == target[i]) {
                ans.add("Push");
                i++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            curr++;
        }

        return ans;
    }
}
