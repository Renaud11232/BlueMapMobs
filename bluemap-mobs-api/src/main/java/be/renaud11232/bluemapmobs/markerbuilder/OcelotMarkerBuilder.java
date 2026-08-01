package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Ocelot;

public class OcelotMarkerBuilder extends AgeableMarkerBuilder<Ocelot> {
    public OcelotMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.OCELOT;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.OCELOT_BABY;
    }
}
