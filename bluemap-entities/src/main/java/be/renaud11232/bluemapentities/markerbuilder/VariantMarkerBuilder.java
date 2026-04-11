package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.icon.Icon;

import java.util.Collection;

public interface VariantMarkerBuilder<T extends Entity, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends MarkerBuilder<T> {
    ICON_VARIANT getIconVariant(T entity);

    default void registerVariantIcons() {

    }

    void registerVariantIcon(ICON_VARIANT v, Icon icon);

    STYLE_CLASSES_VARIANT getStyleClassesVariant(T entity);

    default void registerVariantStyleClasses() {

    }

    void registerVariantStyleClass(STYLE_CLASSES_VARIANT v, Collection<String> styleClasses);
}
