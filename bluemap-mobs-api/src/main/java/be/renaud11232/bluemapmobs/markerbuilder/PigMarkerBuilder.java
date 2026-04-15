package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Pig;

public class PigMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Pig.Variant.TEMPERATE, MobsIcon.TEMPERATE_PIG);
        registerVariantAdultIcon(Pig.Variant.COLD, MobsIcon.COLD_PIG);
        registerVariantAdultIcon(Pig.Variant.WARM, MobsIcon.WARM_PIG);
        //TODO: Baby variants
    }

    @Override
    protected Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }
}
