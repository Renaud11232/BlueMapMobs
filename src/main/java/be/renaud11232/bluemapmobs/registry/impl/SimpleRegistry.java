package be.renaud11232.bluemapmobs.registry.impl;

import be.renaud11232.bluemapmobs.registry.Registry;

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
    public V get(K key) {
        return items.get(key);
    }
}
