package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Squid;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SquidMarkerBuilder extends AgeableMarkerBuilder<Squid> {
    public SquidMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.SQUID;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.SQUID_BABY;
    }
}
