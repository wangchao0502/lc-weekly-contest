package com.raphael.lc.tpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author raphael
 * @date 2021-02-15 17:47:44
 */
class LRUCache {
    /**
     * Description for LRUCache:
     * LRU Cache
     */
    static class Node {
        int key;
        int value;
        Node prev;
        Node next;
        public Node () {}
        public Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    Map<Integer, Node> cache = new HashMap<>();
    int size;
    int capacity;
    Node head, tail;
    
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            if (++size > capacity) {
                Node tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            // update and move to head
            node.value = value;
            moveToHead(node);
        }
    }

    private Node removeTail() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
