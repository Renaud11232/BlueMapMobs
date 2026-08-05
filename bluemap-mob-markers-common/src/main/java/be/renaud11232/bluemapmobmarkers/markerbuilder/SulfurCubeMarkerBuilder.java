package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.SulfurCube;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SulfurCubeMarkerBuilder extends AgeableMarkerBuilder<SulfurCube> {
    public SulfurCubeMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.SULFUR_CUBE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.SULFUR_CUBE_SMALL;
    }
}
