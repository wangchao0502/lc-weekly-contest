package com.raphael.lc.p211;

/**
 * @author raphael
 * @date 2021-02-17 12:50:47
 */
class WordDictionary {

    Trie root;

    public WordDictionary() {
        root = new Trie();
    }

    public void addWord(String word) {
        root.insert(word);
    }

    public boolean findWord(String word, Trie node, int depth) {
        if (depth == word.length()) {
            return node.isEnd;
        }
        char ch = word.charAt(depth);
        if (ch == '.') {
            for (Trie subNode : node.nodes) {
                if (subNode != null && findWord(word, subNode, depth + 1)) {
                    return true;
                }
            }
        } else if (node.contains(ch)) {
            return findWord(word, node.get(ch), depth + 1);
        }
        return false;
    }

    public boolean search(String word) {
        return findWord(word, root, 0);
    }

    /**
     * Description for WordDictionary:
     * 添加与搜索单词 - 数据结构设计
     */

    @SuppressWarnings("unused")
    static class Trie {
        private final Trie[] nodes;
        private boolean isEnd;

        public Trie() {
            nodes = new Trie[26];
        }

        public void insert(String word) {
            Trie root = this;
            for (char ch : word.toCharArray()) {
                if (!root.contains(ch)) {
                    root.set(ch, new Trie());
                }
                root = root.get(ch);
            }
            root.isEnd = true;
        }

        private Trie searchPrefix(String word) {
            Trie root = this;
            for (char ch : word.toCharArray()) {
                if (root.contains(ch)) {
                    root = root.get(ch);
                } else {
                    return null;
                }
            }
            return root;
        }

        public boolean search(String word) {
            Trie root = searchPrefix(word);
            return root != null && root.isEnd;
        }

        public boolean startWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        public boolean contains(char ch) {
            return get(ch) != null;
        }

        public Trie get(char ch) {
            return nodes[ch - 'a'];
        }

        public void set(char ch, Trie node) {
            nodes[ch - 'a'] = node;
        }

    }
}
