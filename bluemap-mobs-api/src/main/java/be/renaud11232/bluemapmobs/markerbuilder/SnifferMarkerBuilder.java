package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Sniffer;

public class SnifferMarkerBuilder extends AgeableMarkerBuilder<Sniffer> {
    public SnifferMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
