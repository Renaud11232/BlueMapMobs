package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.MagmaCube;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MagmaCubeMarkerBuilder extends MobMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.MAGMA_CUBE;
    }
}
