package Medium;

import java.util.*;

public class LeetCode_146_LRUCache_MapLinkedList {
    class DoublyLinkedNode {
        DoublyLinkedNode next;
        DoublyLinkedNode prev;
        int val;
        int key;
    }

    private void addNode(DoublyLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DoublyLinkedNode node) {
        DoublyLinkedNode next = node.next;
        DoublyLinkedNode prev = node.prev;
        next.prev = prev;
        prev.next = next;
    }

    private void moveToHead(DoublyLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private DoublyLinkedNode popTail() {
        DoublyLinkedNode node = this.tail.prev;
        removeNode(node);
        return node;
    }

    private Map<Integer, DoublyLinkedNode> cacheMap = new HashMap<>();
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;
    private int size;
    private int capacity;

    public LeetCode_146_LRUCache_MapLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DoublyLinkedNode();
        this.tail = new DoublyLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DoublyLinkedNode node = cacheMap.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        DoublyLinkedNode node = cacheMap.get(key);
        if (node == null) {
            DoublyLinkedNode newNode = new DoublyLinkedNode();
            newNode.key = key;
            newNode.val = value;
            cacheMap.put(key, newNode);
            addNode(newNode);
            this.size++;
            if (this.size > this.capacity) {
                DoublyLinkedNode remove = popTail();
                cacheMap.remove(remove.key);
                this.size--;
            }
        } else {
            node.val = value;
            cacheMap.put(key, node);
            moveToHead(node);
        }
    }
}
