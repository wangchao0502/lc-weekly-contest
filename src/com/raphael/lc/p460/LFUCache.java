package com.raphael.lc.p460;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-01-24 00:51:26
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
class LFUCache {
    /**
     * Description for LFUCache:
     * 实现 LFU cache
     */
    int minFreq, capacity;
    Map<Integer, Node> keyTable;
    Map<Integer, LinkedList<Node>> freqTable;

    public LFUCache(int capacity) {
        this.minFreq = 0;
        this.capacity = capacity;
        keyTable = new HashMap<>();
        freqTable = new HashMap<>();
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        if (!keyTable.containsKey(key)) {
            return -1;
        }
        Node node = keyTable.get(key);
        int val = node.val;
        int freq = node.freq;
        freqTable.get(freq).remove(node);
        // 如果当前链表为空，我们需要在哈希表中删除，且更新minFreq
        if (freqTable.get(freq).size() == 0) {
            freqTable.remove(freq);
            if (minFreq == freq) {
                minFreq += 1;
            }
        }
        // 插入到 freq + 1 中
        LinkedList<Node> list = freqTable.getOrDefault(freq + 1, new LinkedList<>());
        list.offerFirst(new Node(key, val, freq + 1));
        freqTable.put(freq + 1, list);
        keyTable.put(key, freqTable.get(freq + 1).peekFirst());
        return val;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (!keyTable.containsKey(key)) {
            // 缓存已满，需要进行删除操作
            if (keyTable.size() == capacity) {
                // 通过 minFreq 拿到 freqTable[minFreq] 链表的末尾节点
                Node node = freqTable.get(minFreq).peekLast();
                assert node != null;
                keyTable.remove(node.key);
                freqTable.get(minFreq).pollLast();
                if (freqTable.get(minFreq).size() == 0) {
                    freqTable.remove(minFreq);
                }
            }
            LinkedList<Node> list = freqTable.getOrDefault(1, new LinkedList<>());
            list.offerFirst(new Node(key, value, 1));
            freqTable.put(1, list);
            keyTable.put(key, freqTable.get(1).peekFirst());
            minFreq = 1;
        } else {
            // 与 get 操作基本一致，除了需要更新缓存的值
            Node node = keyTable.get(key);
            int freq = node.freq;
            freqTable.get(freq).remove(node);
            if (freqTable.get(freq).size() == 0) {
                freqTable.remove(freq);
                if (minFreq == freq) {
                    minFreq += 1;
                }
            }
            LinkedList<Node> list = freqTable.getOrDefault(freq + 1, new LinkedList<>());
            list.offerFirst(new Node(key, value, freq + 1));
            freqTable.put(freq + 1, list);
            keyTable.put(key, freqTable.get(freq + 1).peekFirst());
        }
    }

    static class Node {
        int key, val, freq;

        public Node(int key, int val, int freq) {
            this.key = key;
            this.val = val;
            this.freq = freq;
        }
    }
}
