package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Vex;

public class VexMarkerBuilder extends MobSingleVariantMarkerBuilder<Vex, Boolean> {
    public VexMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(false, MobsIcon.VEX);
        registerVariantIcon(true, MobsIcon.VEX_CHARGING);
    }

    @Override
    protected Boolean getVariant(Vex vex) {
        return vex.isCharging();
    }
}
