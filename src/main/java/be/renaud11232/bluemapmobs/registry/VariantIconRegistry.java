package be.renaud11232.bluemapmobs.registry;

import be.renaud11232.bluemapmobs.icon.Icon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VariantIconRegistry<V> {
    private final Map<V, Icon> items;

    public VariantIconRegistry() {
        this.items = new HashMap<>();
    }

    public void register(V variant, Icon icon) {
        items.put(variant, icon);
    }

    public Map<V, Icon> getItems() {
        return Collections.unmodifiableMap(items);
    }
}
