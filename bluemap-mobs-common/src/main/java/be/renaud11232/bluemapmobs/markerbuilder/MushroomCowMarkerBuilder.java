package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.MushroomCow;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MushroomCowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(MushroomCow.Variant.RED, MobsIcon.MUSHROOM_COW_RED);
        registerVariantAdultIcon(MushroomCow.Variant.BROWN, MobsIcon.MUSHROOM_COW_BROWN);
        registerVariantBabyIcon(MushroomCow.Variant.RED, MobsIcon.MUSHROOM_COW_RED_BABY);
        registerVariantBabyIcon(MushroomCow.Variant.BROWN, MobsIcon.MUSHROOM_COW_BROWN_BABY);
    }

    @Override
    protected MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }
}
