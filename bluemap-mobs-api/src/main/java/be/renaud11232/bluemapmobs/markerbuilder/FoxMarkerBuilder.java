package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Fox;

public class FoxMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Fox.Type getVariant(Fox fox) {
        return fox.getType();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Fox.Type.RED, MobsIcon.RED_FOX);
        registerVariantIcon(Fox.Type.SNOW, MobsIcon.SNOW_FOX);
    }
}
