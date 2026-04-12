package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cow;

public class CowMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Cow.Variant.TEMPERATE, MobsIcon.TEMPERATE_COW);
        registerVariantIcon(Cow.Variant.COLD, MobsIcon.COLD_COW);
        registerVariantIcon(Cow.Variant.WARM, MobsIcon.WARM_COW);
    }
}
