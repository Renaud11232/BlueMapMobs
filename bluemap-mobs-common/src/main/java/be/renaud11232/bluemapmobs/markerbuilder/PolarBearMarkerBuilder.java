package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.PolarBear;

public class PolarBearMarkerBuilder extends AgeableMarkerBuilder<PolarBear> {
    public PolarBearMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.POLAR_BEAR;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.POLAR_BEAR_BABY;
    }
}
