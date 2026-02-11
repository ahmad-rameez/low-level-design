package lld.algoMaster.lru;

class DoublyLinkedList<K, V> {
    private final Node<K, V> head;
    private final Node<K, V> tail;

    public DoublyLinkedList() {
        // TODO: Create dummy head and tail nodes with null key/value
        // TODO: Link head.next to tail and tail.prev to head
        head = null;
        tail = null;
    }

    public void addFirst(Node<K, V> node) {
        // TODO: Insert node right after head
        // Steps:
        // 1. node.next = head.next
        // 2. node.prev = head
        // 3. head.next.prev = node
        // 4. head.next = node
    }

    public void remove(Node<K, V> node) {
        // TODO: Detach node from its current position
        // Steps:
        // 1. node.prev.next = node.next
        // 2. node.next.prev = node.prev
    }

    public void moveToFront(Node<K, V> node) {
        // TODO: Move an existing node to the front
        // Hint: Remove it first, then add it to front
    }

    public Node<K, V> removeLast() {
        // TODO: Remove and return the node just before tail (the LRU node)
        // Steps:
        // 1. Check if list is empty (tail.prev == head), return null if so
        // 2. Get the last real node (tail.prev)
        // 3. Remove it using the remove() method
        // 4. Return the removed node
        return null;
    }
}
