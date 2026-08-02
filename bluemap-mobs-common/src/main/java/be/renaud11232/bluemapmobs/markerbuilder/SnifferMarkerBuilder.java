package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Sniffer;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SnifferMarkerBuilder extends AgeableMarkerBuilder<Sniffer> {
    public SnifferMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SNIFFER;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.SNIFFER_BABY;
    }
}
