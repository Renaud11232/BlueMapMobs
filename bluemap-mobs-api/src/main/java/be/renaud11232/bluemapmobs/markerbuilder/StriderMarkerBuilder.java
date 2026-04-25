package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Strider;

public class StriderMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Strider, Boolean> {
    public StriderMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(false, MobsIcon.STRIDER);
        registerVariantAdultIcon(true, MobsIcon.STRIDER_COLD);
        registerVariantBabyIcon(false, MobsIcon.STRIDER_BABY);
        registerVariantBabyIcon(true, MobsIcon.STRIDER_COLD_BABY);
    }

    @Override
    protected Boolean getVariant(Strider strider) {
        return strider.isShivering();
    }
}
