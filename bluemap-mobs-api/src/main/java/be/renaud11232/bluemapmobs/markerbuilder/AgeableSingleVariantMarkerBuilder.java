package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.entity.Ageable;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class AgeableSingleVariantMarkerBuilder<T extends Ageable, VARIANT> extends AgeableVariantMarkerBuilder<T, VARIANT, VARIANT> {
    public AgeableSingleVariantMarkerBuilder(BlueMapAPI api, Configuration configuration) {
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
