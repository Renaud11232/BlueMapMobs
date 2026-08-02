package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cow;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Cow.Variant.TEMPERATE, MobsIcon.COW_TEMPERATE);
        registerVariantAdultIcon(Cow.Variant.COLD, MobsIcon.COW_COLD);
        registerVariantAdultIcon(Cow.Variant.WARM, MobsIcon.COW_WARM);
        registerVariantBabyIcon(Cow.Variant.TEMPERATE, MobsIcon.COW_TEMPERATE_BABY);
        registerVariantBabyIcon(Cow.Variant.COLD, MobsIcon.COW_COLD_BABY);
        registerVariantBabyIcon(Cow.Variant.WARM, MobsIcon.COW_WARM_BABY);
    }

    @Override
    protected Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }
}
