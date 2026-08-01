package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombifiedPiglin;

public class ZombifiedPiglinMarkerBuilder extends AgeableMarkerBuilder<ZombifiedPiglin> {
    public ZombifiedPiglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ZOMBIFIED_PIGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.ZOMBIFIED_PIGLIN_BABY;
    }
}
