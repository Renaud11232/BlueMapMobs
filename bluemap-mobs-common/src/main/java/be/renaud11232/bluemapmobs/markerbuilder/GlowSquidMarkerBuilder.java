package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.GlowSquid;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class GlowSquidMarkerBuilder extends AgeableMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.GLOW_SQUID;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.GLOW_SQUID_BABY;
    }
}
