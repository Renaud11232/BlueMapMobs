package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Cow;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Cow.Variant.TEMPERATE, MobIcon.COW_TEMPERATE);
        registerVariantAdultIcon(Cow.Variant.COLD, MobIcon.COW_COLD);
        registerVariantAdultIcon(Cow.Variant.WARM, MobIcon.COW_WARM);
        registerVariantBabyIcon(Cow.Variant.TEMPERATE, MobIcon.COW_TEMPERATE_BABY);
        registerVariantBabyIcon(Cow.Variant.COLD, MobIcon.COW_COLD_BABY);
        registerVariantBabyIcon(Cow.Variant.WARM, MobIcon.COW_WARM_BABY);
    }

    @Override
    protected Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }
}
