package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.IronGolem;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class IronGolemMarkerBuilder extends MobMarkerBuilder<IronGolem> {
    public IronGolemMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.IRON_GOLEM;
    }
}
