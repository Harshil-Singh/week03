package hasmapandhashfunction.customhashmap;

import java.util.LinkedList;

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;

    // Array of linked lists for separate chaining
    private LinkedList<Entry<K, V>>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new LinkedList[DEFAULT_CAPACITY];
    }

    // Helper class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Insert or update an entry
    public void put(K key, V value) {
        int index = getIndex(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Update existing entry
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
    }

    // Retrieve a value by key
    public V get(K key) {
        int index = getIndex(key);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        return null;  // Key not found
    }

    // Remove an entry by key
    public void remove(K key) {
        int index = getIndex(key);

        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key.equals(key));
        }
    }
}
