package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Zoglin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZoglinMarkerBuilder extends AgeableMarkerBuilder<Zoglin> {
    public ZoglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.ZOGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.ZOGLIN_BABY;
    }
}
