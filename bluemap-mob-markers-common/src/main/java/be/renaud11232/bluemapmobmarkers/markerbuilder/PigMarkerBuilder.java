package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Pig;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PigMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Pig.Variant.TEMPERATE, MobIcon.PIG_TEMPERATE);
        registerVariantAdultIcon(Pig.Variant.COLD, MobIcon.PIG_COLD);
        registerVariantAdultIcon(Pig.Variant.WARM, MobIcon.PIG_WARM);
        registerVariantBabyIcon(Pig.Variant.TEMPERATE, MobIcon.PIG_TEMPERATE_BABY);
        registerVariantBabyIcon(Pig.Variant.COLD, MobIcon.PIG_COLD_BABY);
        registerVariantBabyIcon(Pig.Variant.WARM, MobIcon.PIG_WARM_BABY);
    }

    @Override
    protected Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }
}
