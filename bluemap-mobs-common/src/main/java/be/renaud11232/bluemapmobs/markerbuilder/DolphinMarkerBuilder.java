package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Dolphin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class DolphinMarkerBuilder extends AgeableMarkerBuilder<Dolphin> {
    public DolphinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.DOLPHIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.DOLPHIN_BABY;
    }
}
