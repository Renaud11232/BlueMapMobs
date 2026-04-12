package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Pig;

public class PigMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Pig.Variant.TEMPERATE, MobsIcon.TEMPERATE_PIG);
        registerVariantIcon(Pig.Variant.COLD, MobsIcon.COLD_PIG);
        registerVariantIcon(Pig.Variant.WARM, MobsIcon.WARM_PIG);
    }
}
