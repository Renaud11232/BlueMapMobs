package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Hoglin;

public class HoglinMarkerBuilder extends AgeableMarkerBuilder<Hoglin> {
    public HoglinMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.HOGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.HOGLIN_BABY;
    }
}
