package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Piglin;

public class PiglinMarkerBuilder extends AgeableMarkerBuilder<Piglin> {
    public PiglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.PIGLIN;
    }

    @Override
    protected Icon getBabyIcon(Piglin entity) {
        return MobsIcon.PIGLIN_BABY;
    }
}
