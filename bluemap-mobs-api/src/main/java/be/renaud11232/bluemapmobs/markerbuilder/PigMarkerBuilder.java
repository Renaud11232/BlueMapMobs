package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Pig;

public class PigMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Pig.Variant.TEMPERATE, MobsIcon.PIG_TEMPERATE);
        registerVariantAdultIcon(Pig.Variant.COLD, MobsIcon.PIG_COLD);
        registerVariantAdultIcon(Pig.Variant.WARM, MobsIcon.PIG_WARM);
        //TODO: Baby variants
    }

    @Override
    protected Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }
}
