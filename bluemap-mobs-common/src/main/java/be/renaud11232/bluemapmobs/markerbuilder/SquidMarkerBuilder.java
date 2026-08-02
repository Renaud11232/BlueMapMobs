package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Squid;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SquidMarkerBuilder extends AgeableMarkerBuilder<Squid> {
    public SquidMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SQUID;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.SQUID_BABY;
    }
}
