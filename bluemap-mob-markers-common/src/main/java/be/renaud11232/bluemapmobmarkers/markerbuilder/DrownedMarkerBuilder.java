package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Drowned;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class DrownedMarkerBuilder extends AgeableMarkerBuilder<Drowned> {
    public DrownedMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.DROWNED;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.DROWNED_BABY;
    }
}
