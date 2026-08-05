package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Sniffer;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SnifferMarkerBuilder extends AgeableMarkerBuilder<Sniffer> {
    public SnifferMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.SNIFFER;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.SNIFFER_BABY;
    }
}
