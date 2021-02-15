package com.raphael.lc.p89;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-15 15:41:50
 */
class GrayCode {
    /**
     * Description for GrayCode:
     * 格雷编码
     */
    public List<Integer> grayCode(int n) {
        // code
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = 0; i < n; i++) {
            int add = 1 << i;
            for (int j = ans.size() - 1; j >= 0; j--) {
                ans.add(ans.get(j) + add);
            }
        }
        return ans;
    }
}
