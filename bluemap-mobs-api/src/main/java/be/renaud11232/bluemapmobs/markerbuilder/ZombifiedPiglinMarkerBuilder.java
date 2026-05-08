package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombifiedPiglin;

public class ZombifiedPiglinMarkerBuilder extends AgeableMarkerBuilder<ZombifiedPiglin> {
    public ZombifiedPiglinMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
