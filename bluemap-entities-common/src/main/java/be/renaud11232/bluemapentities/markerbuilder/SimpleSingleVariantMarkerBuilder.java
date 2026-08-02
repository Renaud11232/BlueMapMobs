package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.Entity;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class SimpleSingleVariantMarkerBuilder<T extends Entity, VARIANT> extends SimpleVariantMarkerBuilder<T, VARIANT, VARIANT> {
    public SimpleSingleVariantMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
