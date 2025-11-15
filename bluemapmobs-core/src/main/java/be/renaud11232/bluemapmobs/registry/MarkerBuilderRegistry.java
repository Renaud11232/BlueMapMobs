package be.renaud11232.bluemapmobs.registry;

import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("rawtypes")
public class MarkerBuilderRegistry<T> {
    private final Map<Class<? extends T>, MarkerBuilder> items;

    public MarkerBuilderRegistry() {
        this.items = new HashMap<>();
    }

    public <U extends T> void register(Class<? extends U> key, MarkerBuilder<? super U> value) {
        items.put(key, value);
    }

    public Set<Map.Entry<Class<? extends T>, MarkerBuilder>> entrySet() {
        return items.entrySet()
                .stream()
                .map(entry -> new AbstractMap.SimpleImmutableEntry<Class<? extends T>, MarkerBuilder>(entry.getKey(), entry.getValue()))
                .collect(Collectors.toUnmodifiableSet());
    }
}
