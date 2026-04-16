package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cow;

public class CowMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Cow.Variant.TEMPERATE, MobsIcon.COW_TEMPERATE);
        registerVariantAdultIcon(Cow.Variant.COLD, MobsIcon.COW_COLD);
        registerVariantAdultIcon(Cow.Variant.WARM, MobsIcon.COW_WARM);
        //TODO: Baby variants
    }

    @Override
    protected Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }
}
