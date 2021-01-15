package com.raphael.lc.p208;

/**
 * @author raphael
 * @date 2021-01-15 21:52:26
 */
class MyTrie {
    /**
     * Description for MyTrie:
     * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
     */
    int deep;
    int[][] son;
    int idx = 0;
    int[] cnt;

    public MyTrie() {
        this(10000);
    }

    public MyTrie(int n) {
        this.deep = n;
        this.son = new int[n][26];
        this.cnt = new int[n];
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        char[] chs = word.toCharArray();
        // 表示从根节点开始向下构建
        int p = 0;
        for (char ch : chs) {
            int u = ch - 'a';
            if (son[p][u] == 0) {
                son[p][u] = ++idx;
            }
            p = son[p][u];
        }
        cnt[p]++;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        char[] chs = word.toCharArray();
        int p = 0;
        for (char ch : chs) {
            int u = ch - 'a';
            if (son[p][u] == 0) {
                return false;
            }
            p = son[p][u];
        }
        return cnt[p] > 0;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        char[] chs = prefix.toCharArray();
        int p = 0;
        for (char ch : chs) {
            int u = ch - 'a';
            if (son[p][u] == 0) {
                return false;
            }
            p = son[p][u];
        }
        return true;
    }
}
