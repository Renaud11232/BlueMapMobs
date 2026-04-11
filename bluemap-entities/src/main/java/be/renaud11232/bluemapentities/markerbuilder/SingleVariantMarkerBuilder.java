package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.entity.Entity;

public interface SingleVariantMarkerBuilder<T extends Entity, VARIANT> extends VariantMarkerBuilder<T, VARIANT, VARIANT> {
    @Override
    default VARIANT getIconVariant(T entity) {
        return getVariant(entity);
    }

    @Override
    default VARIANT getStyleClassesVariant(T entity) {
        return getVariant(entity);
    }

    VARIANT getVariant(T entity);
}
