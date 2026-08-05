package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Hoglin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class HoglinMarkerBuilder extends AgeableMarkerBuilder<Hoglin> {
    public HoglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.HOGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.HOGLIN_BABY;
    }
}
