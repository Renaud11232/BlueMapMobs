package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Drowned;

public class DrownedMarkerBuilder extends AgeableMarkerBuilder<Drowned> {
    public DrownedMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.DROWNED;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.DROWNED_BABY;
    }
}
