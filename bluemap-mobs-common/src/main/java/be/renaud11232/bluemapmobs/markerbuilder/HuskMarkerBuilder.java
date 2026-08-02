package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Husk;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class HuskMarkerBuilder extends AgeableMarkerBuilder<Husk> {
    public HuskMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.HUSK;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.HUSK_BABY;
    }
}
