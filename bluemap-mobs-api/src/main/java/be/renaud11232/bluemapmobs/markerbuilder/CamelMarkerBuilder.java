package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Camel;

public class CamelMarkerBuilder extends AgeableMarkerBuilder<Camel> {
    public CamelMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.CAMEL;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.CAMEL_BABY;
    }
}
