package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.MushroomCow;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MushroomCowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(MushroomCow.Variant.RED, MobIcon.MUSHROOM_COW_RED);
        registerVariantAdultIcon(MushroomCow.Variant.BROWN, MobIcon.MUSHROOM_COW_BROWN);
        registerVariantBabyIcon(MushroomCow.Variant.RED, MobIcon.MUSHROOM_COW_RED_BABY);
        registerVariantBabyIcon(MushroomCow.Variant.BROWN, MobIcon.MUSHROOM_COW_BROWN_BABY);
    }

    @Override
    protected MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }
}
