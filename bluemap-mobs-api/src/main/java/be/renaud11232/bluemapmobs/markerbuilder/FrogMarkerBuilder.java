package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Frog;

public class FrogMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(Frog.Variant.COLD, MobsIcon.COLD_FROG);
        registerVariantIcon(Frog.Variant.WARM, MobsIcon.TROPICAL_FROG);
        registerVariantIcon(Frog.Variant.TEMPERATE, MobsIcon.TEMPERATE_FROG);
    }

    @Override
    protected Frog.Variant getVariant(Frog frog) {
        return frog.getVariant();
    }
}
