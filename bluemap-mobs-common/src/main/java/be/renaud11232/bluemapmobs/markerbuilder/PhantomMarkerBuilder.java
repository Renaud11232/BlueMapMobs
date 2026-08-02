package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Phantom;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PhantomMarkerBuilder extends MobMarkerBuilder<Phantom> {
    public PhantomMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.PHANTOM;
    }
}
