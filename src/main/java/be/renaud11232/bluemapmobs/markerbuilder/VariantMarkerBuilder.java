package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;
import org.bukkit.entity.Entity;

public interface VariantMarkerBuilder<T extends Entity, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends MarkerBuilder<T> {
    default ICON_VARIANT getIconVariant(T entity) {
        return null;
    }

    default void registerVariantIcons(VariantIconRegistry<ICON_VARIANT> registry){

    }

    default STYLE_CLASSES_VARIANT getStyleClassesVariant(T entity) {
        return null;
    }

    default void registerVariantStyleClasses(VariantStyleClassesRegistry<STYLE_CLASSES_VARIANT> registry){

    }
}
