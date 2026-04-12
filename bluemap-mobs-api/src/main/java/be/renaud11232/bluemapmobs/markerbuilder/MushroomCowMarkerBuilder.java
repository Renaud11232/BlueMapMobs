package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends SimpleSingleVariantMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(MushroomCow.Variant.RED, MobsIcon.RED_MOOSHROOM);
        registerVariantIcon(MushroomCow.Variant.BROWN, MobsIcon.BROWN_MOOSHROOM);
    }
}
