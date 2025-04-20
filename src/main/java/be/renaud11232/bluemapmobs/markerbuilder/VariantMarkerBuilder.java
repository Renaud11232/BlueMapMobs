package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.Registry;

import java.util.Collection;

public interface VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends MarkerBuilder<T> {
    default ICON_VARIANT getIconVariant(T element) {
        return null;
    }

    default void registerVariantIcons(Registry<ICON_VARIANT, Icon> registry){

    }

    default STYLE_CLASSES_VARIANT getStyleClassesVariant(T element) {
        return null;
    }

    default void registerVariantStyleClasses(Registry<STYLE_CLASSES_VARIANT, Collection<String>> registry){

    }
}
