package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.MagmaCube;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MagmaCubeMarkerBuilder extends MobMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.MAGMA_CUBE;
    }
}
