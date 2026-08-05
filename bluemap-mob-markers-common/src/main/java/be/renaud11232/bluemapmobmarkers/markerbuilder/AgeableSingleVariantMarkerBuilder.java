package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.entity.Ageable;
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
