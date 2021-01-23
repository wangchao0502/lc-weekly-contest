package com.raphael.lc.p146;

import java.util.HashMap;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-01-23 18:44:48
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
class LRUCache {
    private final Map<Integer, DLinkedNode> cache = new HashMap<>();
    private final int capacity;
    private final DLinkedNode head;
    private final DLinkedNode tail;
    private int size;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        // 使用伪头部和伪尾部节点
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点
            DLinkedNode newNode = new DLinkedNode(key, value);
            // 填进哈希表
            cache.put(key, newNode);
            // 添加到双向链表的头部
            addToHead(newNode);
            size++;
            if (size > capacity) {
                // 删除双向量表尾部节点
                DLinkedNode tail = removeTail();
                // 删除哈希表中对应的项
                cache.remove(tail.key);
                size--;
            }
        } else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.value = value;
            moveToHead(node);
        }
    }

    /**
     * Description for LRUCache:
     * 实现LRU缓存
     * 哈希表 + 双向链表
     */
    static class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
