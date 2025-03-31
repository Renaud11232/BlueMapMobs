package be.renaud11232.bluemapmobs.registry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleRegistry<K, V> implements Registry<K, V> {
    private final Map<K, V> items;

    public SimpleRegistry() {
        this.items = new HashMap<>();
    }

    @Override
    public void register(K key, V value) {
        items.put(key, value);
    }

    @Override
    public Map<K, V> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
