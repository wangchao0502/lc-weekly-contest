package com.raphael.lc.p1707;

/**
 * @author Raphael
 * @date 2021-05-23 12:09:54
 */
class Trie {
    static final int L = 30;
    Trie[] children = new Trie[2];
    int min = Integer.MAX_VALUE;

    public void insert(int val) {
        Trie node = this;
        node.min = Math.min(node.min, val);
        for (int i = L - 1; i >= 0; --i) {
            int bit = (val >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new Trie();
            }
            node = node.children[bit];
            node.min = Math.min(node.min, val);
        }
    }

    public int getMaxXorWithLimit(int val, int limit) {
        Trie node = this;
        if (node.min > limit) {
            return -1;
        }
        int ans = 0;
        for (int i = L - 1; i >= 0; --i) {
            int bit = (val >> i) & 1;
            if (node.children[bit ^ 1] != null && node.children[bit ^ 1].min <= limit) {
                ans |= 1 << i;
                bit ^= 1;
            }
            node = node.children[bit];
        }
        return ans;
    }
}

class MaximizeXor {
    /**
     * Description for MaximizeXor:
     * 与数组中元素的最大异或值
     */
    public int[] maximizeXor(int[] nums, int[][] queries) {
        // code
        Trie trie = new Trie();
        for (int val : nums) {
            trie.insert(val);
        }
        int numQ = queries.length;
        int[] ans = new int[numQ];
        for (int i = 0; i < numQ; ++i) {
            ans[i] = trie.getMaxXorWithLimit(queries[i][0], queries[i][1]);
        }
        return ans;
    }
}
