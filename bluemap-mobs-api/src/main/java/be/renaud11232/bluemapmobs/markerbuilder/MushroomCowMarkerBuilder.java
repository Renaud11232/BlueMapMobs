package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(MushroomCow.Variant.RED, MobsIcon.RED_MOOSHROOM);
        registerVariantAdultIcon(MushroomCow.Variant.BROWN, MobsIcon.BROWN_MOOSHROOM);
        //TODO: Baby variants
    }

    @Override
    protected MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }
}
