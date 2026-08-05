package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Goat;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class GoatMarkerBuilder extends AgeableMarkerBuilder<Goat> {
    public GoatMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.GOAT;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.GOAT_BABY;
    }
}
