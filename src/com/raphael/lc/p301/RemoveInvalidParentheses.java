package com.raphael.lc.p301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-05-04 14:34:18
 */
class RemoveInvalidParentheses {
    /**
     * Description for RemoveInvalidParentheses:
     * 删除无效的括号
     */

    int len;

    public List<String> removeInvalidParentheses(String s) {
        // code
        char[] cs = s.toCharArray();
        int l = 0, r = 0;
        for (char c : cs) {
            if (c == '(') l++;
            else if (c == ')') r++;
        }

        int max = Math.min(l, r);
        Set<String> all = new HashSet<>();
        dfs(cs, 0, 0, max, "", all);
        List<String> ans = new ArrayList<>();
        for (String str : all) {
            if (str.length() == len) {
                ans.add(str);
            }
        }

        return ans;
    }

    private void dfs(char[] cs, int idx, int score, int max, String cur, Set<String> all) {
        if (idx == cs.length) {
            if (score == 0 && cur.length() >= len) {
                len = Math.max(len, cur.length());
                all.add(cur);
            }
            return;
        }

        if (cs[idx] == '(') {
            if (score + 1 <= max) dfs(cs, idx + 1, score + 1, max, cur + "(", all);
            dfs(cs, idx + 1, score, max, cur, all);
        } else if (cs[idx] == ')') {
            if (score > 0) dfs(cs, idx + 1, score - 1, max, cur + ")", all);
            dfs(cs, idx + 1, score, max, cur, all);
        } else {
            dfs(cs, idx + 1, score, max, cur + cs[idx], all);
        }
    }
}
