package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.EnderDragon;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class EnderDragonMarkerBuilder extends MobMarkerBuilder<EnderDragon> {
    public EnderDragonMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.ENDER_DRAGON;
    }
}
