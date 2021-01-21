package com.raphael.lc.p1489;

import com.raphael.lc.common.UnionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-21 22:58:53
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class FindCriticalAndPseudoCriticalEdges {
    /**
     * Description for FindCriticalAndPseudoCriticalEdges:
     * 最小生成树关键边和伪关键边
     */
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        // code
        int m = edges.length;
        int[][] newEdges = new int[m][4];

        for (int i = 0; i < m; i++) {
            System.arraycopy(edges[i], 0, newEdges[i], 0, edges[i].length);
            // 记录边号
            newEdges[i][3] = i;
        }

        Arrays.sort(newEdges, Comparator.comparingInt(o -> o[2]));
        UnionFind uf = new UnionFind(n);
        int value = 0;
        for (int i = 0; i < m; i++) {
            if (uf.union(newEdges[i][0], newEdges[i][1])) {
                value += newEdges[i][2];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            UnionFind uf2 = new UnionFind(n);
            int v = 0;
            for (int j = 0; j < m; j++) {
                if (i != j && uf2.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (uf2.getCount() != 1 || uf2.getCount() == 1 && v > value) {
                ans.get(0).add(newEdges[i][3]);
                continue;
            }
            uf2 = new UnionFind(n);
            uf2.union(newEdges[i][0], newEdges[i][1]);
            v = newEdges[i][2];
            for (int j = 0; j < m; j++) {
                if (i != j && uf2.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (v == value) {
                ans.get(1).add(newEdges[i][3]);
            }
        }

        return ans;
    }
}
