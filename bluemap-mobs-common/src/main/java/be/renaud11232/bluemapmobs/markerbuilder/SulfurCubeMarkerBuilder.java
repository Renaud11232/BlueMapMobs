package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.SulfurCube;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SulfurCubeMarkerBuilder extends AgeableMarkerBuilder<SulfurCube> {
    public SulfurCubeMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
