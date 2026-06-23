package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.SulfurCube;

public class SulfurCubeMarkerBuilder extends AgeableMarkerBuilder<SulfurCube> {
    public SulfurCubeMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SULFUR_CUBE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.SULFUR_CUBE_SMALL;
    }
}
