package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.entity.Entity;

public abstract class SimpleSingleVariantMarkerBuilder<T extends Entity, VARIANT> extends SimpleVariantMarkerBuilder<T, VARIANT, VARIANT> implements SingleVariantMarkerBuilder<T, VARIANT> {
    public SimpleSingleVariantMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }
}
