package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Camel;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CamelMarkerBuilder extends AgeableMarkerBuilder<Camel> {
    public CamelMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.CAMEL;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.CAMEL_BABY;
    }
}
