package com.raphael.lc.p1202;

import com.raphael.lc.common.UnionFind;

import java.util.*;

/**
 * @author raphael
 * @date 2021-01-11 10:41:23
 */
class SmallestStringWithSwaps {
    /**
     * Description for SmallestStringWithSwaps:
     * 给你一个字符串s，以及该字符串中的一些「索引对」数组pairs，其中pairs[i] = [a, b]表示字符串中的两个索引（编号从 0 开始）。
     * 你可以 任意多次交换 在pairs中任意一对索引处的字符。
     * 返回在经过若干次交换后，s可以变成的按字典序最小的字符串。
     */
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        // code
        int len = s.length();
        UnionFind uf = new UnionFind(len);
        for (List<Integer> pair: pairs) {
            uf.union(pair.get(0), pair.get(1));
        }

        HashMap<Integer, PriorityQueue<Character>> hmap = new HashMap<>(16);
        for (int i = 0; i < len; i++) {
            int root = uf.find(i);
            hmap.computeIfAbsent(root, key -> new PriorityQueue<>()).add(s.charAt(i));
        }

        // 这里比较巧妙，能够保证所有字符按分组顺序被遍历到
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int root = uf.find(i);
            sb.append(hmap.get(root).poll());
        }

        return sb.toString();
    }
}
