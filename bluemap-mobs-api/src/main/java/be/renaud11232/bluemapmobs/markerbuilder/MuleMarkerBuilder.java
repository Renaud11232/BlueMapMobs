package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Mule;

public class MuleMarkerBuilder extends AgeableMarkerBuilder<Mule> {
    public MuleMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.MULE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.MULE_BABY;
    }
}
