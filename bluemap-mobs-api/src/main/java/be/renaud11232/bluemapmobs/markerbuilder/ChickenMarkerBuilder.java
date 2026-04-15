package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Chicken;

public class ChickenMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Chicken.Variant.TEMPERATE, MobsIcon.TEMPERATE_CHICKEN);
        registerVariantAdultIcon(Chicken.Variant.COLD, MobsIcon.COLD_CHICKEN);
        registerVariantAdultIcon(Chicken.Variant.WARM, MobsIcon.WARM_CHICKEN);
        //TODO: Baby variants
    }

    @Override
    protected Chicken.Variant getVariant(Chicken chicken) {
        return chicken.getVariant();
    }
}
