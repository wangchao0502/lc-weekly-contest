package com.raphael.lc.p839;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-31 10:20:40
 */
class NumSimilarGroups {
    /**
     * Description for NumSimilarGroups:
     * 相似字符串组
     */
    private boolean compare(String str1, String str2) {
        int n = str1.length();
        List<Integer> ptr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (ptr.size() > 2) {
                    return false;
                } else {
                    ptr.add(i);
                }
            }
        }
        if (ptr.size() == 0) {
            return true;
        }
        return str1.charAt(ptr.get(0)) == str2.charAt(ptr.get(1)) && str1.charAt(ptr.get(1)) == str2.charAt(ptr.get(0));
    }

    public int numSimilarGroups(String[] strs) {
        // code
        int n = strs.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && compare(strs[i], strs[j])) {
                    uf.union(i, j);
                }
            }
        }
        return uf.getCount();
    }
}
