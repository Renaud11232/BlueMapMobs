package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Silverfish;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SilverfishMarkerBuilder extends MobMarkerBuilder<Silverfish> {
    public SilverfishMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.SILVERFISH;
    }
}
