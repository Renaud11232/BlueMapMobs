package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Pig;

public class PigMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Pig.Variant.TEMPERATE, MobsIcon.PIG_TEMPERATE);
        registerVariantAdultIcon(Pig.Variant.COLD, MobsIcon.PIG_COLD);
        registerVariantAdultIcon(Pig.Variant.WARM, MobsIcon.PIG_WARM);
        registerVariantBabyIcon(Pig.Variant.TEMPERATE, MobsIcon.PIG_TEMPERATE_BABY);
        registerVariantBabyIcon(Pig.Variant.COLD, MobsIcon.PIG_COLD_BABY);
        registerVariantBabyIcon(Pig.Variant.WARM, MobsIcon.PIG_WARM_BABY);
    }

    @Override
    protected Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }
}
