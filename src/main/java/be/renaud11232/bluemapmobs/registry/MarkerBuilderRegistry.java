package be.renaud11232.bluemapmobs.registry;

import be.renaud11232.bluemapmobs.markerbuilder.v2.MarkerBuilder;
import org.bukkit.entity.Entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MarkerBuilderRegistry<T extends Entity> {
    private final Map<Class<? extends T>, MarkerBuilder<? extends T>> items;

    public MarkerBuilderRegistry() {
        this.items = new HashMap<>();
    }

    public <U extends T> void register(Class<? extends U> klass, MarkerBuilder<U> builder) {
        items.put(klass, builder);
    }

    @SuppressWarnings("rawtypes")
    public Map<Class<? extends T>, MarkerBuilder> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
