package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.entity.Ageable;

public abstract class AgeableSingleVariantMarkerBuilder<T extends Ageable, VARIANT> extends AgeableVariantMarkerBuilder<T, VARIANT, VARIANT> {
    public AgeableSingleVariantMarkerBuilder(BlueMapEntitiesAPI api) {
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
