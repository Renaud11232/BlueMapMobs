package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Goat;

public class GoatMarkerBuilder extends AgeableMarkerBuilder<Goat> {
    public GoatMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.GOAT;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.GOAT_BABY;
    }
}
