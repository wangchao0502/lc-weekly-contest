package com.raphael.lc.weekly230.p5689;

import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-28 10:30:49
 */
class CountMatches {
    /**
     * Description for CountMatches:
     * 统计匹配检索规则的物品数量
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // code
        int ans = 0;
        for (List<String> item : items) {
            if ("type".equals(ruleKey)){
                ans += item.get(0).equals(ruleValue) ? 1 : 0;
            }
            if ("color".equals(ruleKey)){
                ans += item.get(1).equals(ruleValue) ? 1 : 0;
            }
            if ("name".equals(ruleKey)){
                ans += item.get(2).equals(ruleValue) ? 1 : 0;
            }
        }
        return ans;
    }
}
