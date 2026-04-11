package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.entity.Entity;

public abstract class SimpleSingleVariantMarkerBuilder<T extends Entity, VARIANT> extends SimpleVariantMarkerBuilder<T, VARIANT, VARIANT> {
    public SimpleSingleVariantMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected VARIANT getIconVariant(T entity) {
        return getVariant(entity);
    }

    @Override
    protected VARIANT getStyleClassesVariant(T entity) {
        return getVariant(entity);
    }

    protected abstract VARIANT getVariant(T entity);
}
