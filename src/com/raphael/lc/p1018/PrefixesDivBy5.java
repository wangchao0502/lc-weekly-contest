package com.raphael.lc.p1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-14 17:01:51
 */
class PrefixesDivBy5 {
    /**
     * Description for PrefixesDivBy5:
     * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
     * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
     */
    public List<Boolean> prefixesDivBy5(int[] bits) {
        // code
        List<Boolean> ans = new ArrayList<>();
        int x = 0;

        for (int b : bits) {
            x <<= 1;
            x += b;
            ans.add(x % 5 == 0);
            x %= 10;
        }

        return ans;
    }
}
