package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.PolarBear;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PolarBearMarkerBuilder extends AgeableMarkerBuilder<PolarBear> {
    public PolarBearMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.POLAR_BEAR;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.POLAR_BEAR_BABY;
    }
}
