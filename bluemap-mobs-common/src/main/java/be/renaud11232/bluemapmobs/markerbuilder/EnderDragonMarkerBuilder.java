package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.EnderDragon;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class EnderDragonMarkerBuilder extends MobMarkerBuilder<EnderDragon> {
    public EnderDragonMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.ENDER_DRAGON;
    }
}
