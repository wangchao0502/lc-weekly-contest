package com.raphael.lc.p959;

import com.raphael.lc.common.UnionFind;

/**
 * @author raphael
 * @date 2021-01-25 19:54:49
 */
class RegionsBySlashes {
    /**
     * Description for RegionsBySlashes:
     * 由斜杠划分区域
     */
    public int regionsBySlashes(String[] grid) {
        // code
        int n = grid.length;
        // 每个小放个分成四个三角形，使用并查集确定连通性，顺时针0，1，2, 3编号
        UnionFind uf = new UnionFind(n * n * 4);

        for (int i = 0; i < n; i++) {
            char[] chars =grid[i].toCharArray();
            for (int j = 0; j < n; j++) {
                int idx = (i * n + j) * 4;
                if (chars[j] == '/') {
                    uf.union(idx, idx + 3);
                    uf.union(idx + 1, idx + 2);
                } else if (chars[j] == '\\') {
                    uf.union(idx, idx + 1);
                    uf.union(idx + 2, idx + 3);
                } else {
                    uf.union(idx + 1, idx + 2);
                    uf.union(idx + 2, idx + 3);
                    uf.union(idx + 3, idx);
                }
                if (i > 0) {
                    // 连接上一层相邻方块
                    uf.union(idx, ((i - 1) * n + j) * 4 + 2);
                }
                if (j > 0) {
                    // 连接左边相邻方块
                    uf.union(idx + 3, (i * n + (j - 1)) * 4 + 1);
                }
            }
        }

        return uf.getCount();
    }
}
