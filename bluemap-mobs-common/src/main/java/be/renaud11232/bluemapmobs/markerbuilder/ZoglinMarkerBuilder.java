package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Zoglin;

public class ZoglinMarkerBuilder extends AgeableMarkerBuilder<Zoglin> {
    public ZoglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ZOGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.ZOGLIN_BABY;
    }
}
