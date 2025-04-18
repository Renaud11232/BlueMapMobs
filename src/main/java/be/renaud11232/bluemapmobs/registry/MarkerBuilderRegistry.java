package be.renaud11232.bluemapmobs.registry;

import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;
import org.bukkit.entity.Entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class MarkerBuilderRegistry<T extends Entity> {
    private final Map<Class<? extends T>, MarkerBuilder> items;

    public MarkerBuilderRegistry() {
        this.items = new HashMap<>();
    }

    public <U extends T> void register(Class<? extends U> key, MarkerBuilder<? super U> value) {
        items.put(key, value);
    }

    public Map<Class<? extends T>, MarkerBuilder> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
