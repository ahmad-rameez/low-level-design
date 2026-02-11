package lld.algoMaster.lru;

import java.util.Map;

class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> map;
    private final DoublyLinkedList<K, V> list;

    public LRUCache(int capacity) {
        // TODO: Initialize capacity, create empty HashMap, create new DoublyLinkedList
        this.capacity = 0;
        this.map = null;
        this.list = null;
    }

    public synchronized V get(K key) {
        // TODO: Implement get operation
        // Steps:
        // 1. If key not in map, return null
        // 2. Get the node from the map
        // 3. Move the node to front (mark as most recently used)
        // 4. Return the node's value
        return null;
    }

    public synchronized void put(K key, V value) {
        // TODO: Implement put operation
        // Case 1: Key already exists
        //   - Get the existing node
        //   - Update its value
        //   - Move it to front
        //
        // Case 2: Key is new
        //   - If at capacity, evict LRU item:
        //     - Remove last node from list
        //     - Remove its key from map
        //   - Create new node
        //   - Add to front of list
        //   - Add to map
    }
}