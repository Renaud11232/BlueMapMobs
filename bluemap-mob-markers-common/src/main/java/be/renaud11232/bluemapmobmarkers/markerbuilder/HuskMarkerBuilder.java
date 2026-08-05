package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Husk;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class HuskMarkerBuilder extends AgeableMarkerBuilder<Husk> {
    public HuskMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.HUSK;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.HUSK_BABY;
    }
}
