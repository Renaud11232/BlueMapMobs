package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.PiglinBrute;

public class PiglinBruteMarkerBuilder extends MobMarkerBuilder<PiglinBrute> {
    public PiglinBruteMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.PIGLIN_BRUTE;
    }
}
