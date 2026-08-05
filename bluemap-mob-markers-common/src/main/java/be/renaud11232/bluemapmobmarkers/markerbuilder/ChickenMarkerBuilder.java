package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Chicken;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ChickenMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Chicken.Variant.TEMPERATE, MobIcon.CHICKEN_TEMPERATE);
        registerVariantAdultIcon(Chicken.Variant.COLD, MobIcon.CHICKEN_COLD);
        registerVariantAdultIcon(Chicken.Variant.WARM, MobIcon.CHICKEN_WARM);
        registerVariantBabyIcon(Chicken.Variant.TEMPERATE, MobIcon.CHICKEN_TEMPERATE_BABY);
        registerVariantBabyIcon(Chicken.Variant.COLD, MobIcon.CHICKEN_COLD_BABY);
        registerVariantBabyIcon(Chicken.Variant.WARM, MobIcon.CHICKEN_WARM_BABY);
    }

    @Override
    protected Chicken.Variant getVariant(Chicken chicken) {
        return chicken.getVariant();
    }
}
