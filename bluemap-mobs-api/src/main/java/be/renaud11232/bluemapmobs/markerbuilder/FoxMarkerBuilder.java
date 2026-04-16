package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Fox;

public class FoxMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Fox.Type.RED, MobsIcon.FOX_RED);
        registerVariantAdultIcon(Fox.Type.SNOW, MobsIcon.FOX_SNOW);
        //TODO: add baby variants
    }

    @Override
    protected Fox.Type getVariant(Fox fox) {
        return fox.getType();
    }
}
