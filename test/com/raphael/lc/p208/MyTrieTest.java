package com.raphael.lc.p208;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-15 21:52:26
 */
class MyTrieTest {
    @Test
    void t1() {
        MyTrie trie = new MyTrie();

        trie.insert("apple");
        Assertions.assertTrue(trie.search("apple"));
        Assertions.assertFalse(trie.search("app"));
        Assertions.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assertions.assertTrue(trie.search("app"));
    }
}
