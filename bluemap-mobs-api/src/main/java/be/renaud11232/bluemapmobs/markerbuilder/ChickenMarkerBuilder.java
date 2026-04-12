package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Chicken;

public class ChickenMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Chicken.Variant getVariant(Chicken chicken) {
        return chicken.getVariant();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Chicken.Variant.TEMPERATE, MobsIcon.TEMPERATE_CHICKEN);
        registerVariantIcon(Chicken.Variant.COLD, MobsIcon.COLD_CHICKEN);
        registerVariantIcon(Chicken.Variant.WARM, MobsIcon.WARM_CHICKEN);
    }
}
