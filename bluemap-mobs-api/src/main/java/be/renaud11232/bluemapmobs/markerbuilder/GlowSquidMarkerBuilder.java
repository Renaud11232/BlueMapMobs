package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.GlowSquid;

public class GlowSquidMarkerBuilder extends AgeableMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
