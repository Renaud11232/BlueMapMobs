package be.renaud11232.bluemapmobs.registry;

import java.util.Map;

public interface Registry<K, V> {
    void register(K key, V value);
    Map<K, V> getItems();
}
