package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Vex;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class VexMarkerBuilder extends MobSingleVariantMarkerBuilder<Vex, Boolean> {
    public VexMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(false, MobIcon.VEX);
        registerVariantIcon(true, MobIcon.VEX_CHARGING);
    }

    @Override
    protected Boolean getVariant(Vex vex) {
        return vex.isCharging();
    }
}
