package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;

public interface VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends MarkerBuilder<T> {
    default ICON_VARIANT getIconVariant(T element) {
        return null;
    }

    default void registerVariantIcons(VariantIconRegistry<ICON_VARIANT> registry){

    }

    default STYLE_CLASSES_VARIANT getStyleClassesVariant(T element) {
        return null;
    }

    default void registerVariantStyleClasses(VariantStyleClassesRegistry<STYLE_CLASSES_VARIANT> registry){

    }
}
