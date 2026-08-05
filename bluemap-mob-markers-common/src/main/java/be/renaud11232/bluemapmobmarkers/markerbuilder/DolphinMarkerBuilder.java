package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Dolphin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class DolphinMarkerBuilder extends AgeableMarkerBuilder<Dolphin> {
    public DolphinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.DOLPHIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.DOLPHIN_BABY;
    }
}
