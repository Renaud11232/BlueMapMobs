package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.ZombifiedPiglin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZombifiedPiglinMarkerBuilder extends AgeableMarkerBuilder<ZombifiedPiglin> {
    public ZombifiedPiglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.ZOMBIFIED_PIGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.ZOMBIFIED_PIGLIN_BABY;
    }
}
