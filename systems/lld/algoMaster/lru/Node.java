package lld.algoMaster.lru;

public class Node<K, V> {
    private K Key;
    private V Value;

    public Node(K key, V value) {
        Key = key;
        Value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return Value;
    }

    public void setValue(V value) {
        Value = value;
    }
}
