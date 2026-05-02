package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Vex;

public class VexMarkerBuilder extends MobSingleVariantMarkerBuilder<Vex, Boolean> {
    public VexMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(false, MobsIcon.VEX);
        registerVariantIcon(true, MobsIcon.VEX_CHARGING);
    }

    @Override
    protected Boolean getVariant(Vex vex) {
        return vex.isCharging();
    }
}
