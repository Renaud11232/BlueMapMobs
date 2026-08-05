package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Tadpole;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class TadpoleMarkerBuilder extends MobMarkerBuilder<Tadpole> {
    public TadpoleMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.TADPOLE;
    }
}
