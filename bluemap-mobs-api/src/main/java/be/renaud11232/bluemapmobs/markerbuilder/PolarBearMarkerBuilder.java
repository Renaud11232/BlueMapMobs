package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.PolarBear;

public class PolarBearMarkerBuilder extends AgeableMarkerBuilder<PolarBear> {
    public PolarBearMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
