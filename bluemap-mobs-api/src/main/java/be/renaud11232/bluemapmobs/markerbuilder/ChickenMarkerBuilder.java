package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Chicken;

public class ChickenMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Chicken.Variant.TEMPERATE, MobsIcon.CHICKEN_TEMPERATE);
        registerVariantAdultIcon(Chicken.Variant.COLD, MobsIcon.CHICKEN_COLD);
        registerVariantAdultIcon(Chicken.Variant.WARM, MobsIcon.CHICKEN_WARM);
        registerVariantBabyIcon(Chicken.Variant.TEMPERATE, MobsIcon.CHICKEN_TEMPERATE_BABY);
        registerVariantBabyIcon(Chicken.Variant.COLD, MobsIcon.CHICKEN_COLD_BABY);
        registerVariantBabyIcon(Chicken.Variant.WARM, MobsIcon.CHICKEN_WARM_BABY);
    }

    @Override
    protected Chicken.Variant getVariant(Chicken chicken) {
        return chicken.getVariant();
    }
}
