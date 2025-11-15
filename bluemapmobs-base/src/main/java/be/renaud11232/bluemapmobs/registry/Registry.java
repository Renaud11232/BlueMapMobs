package be.renaud11232.bluemapmobs.registry;

public interface Registry<K, V> {
    void register(K key, V value);
    V get(K key);
}
