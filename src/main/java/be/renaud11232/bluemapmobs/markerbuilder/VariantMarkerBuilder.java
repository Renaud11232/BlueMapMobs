package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.entity.Entity;

public interface VariantMarkerBuilder<T extends Entity, V> extends MarkerBuilder<T> {
    V getVariant(T entity);
    void registerVariantIcons(VariantIconRegistry<V> registry);
}
