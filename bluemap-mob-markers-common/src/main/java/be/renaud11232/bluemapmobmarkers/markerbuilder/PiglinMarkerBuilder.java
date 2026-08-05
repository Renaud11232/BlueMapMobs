package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Piglin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PiglinMarkerBuilder extends AgeableMarkerBuilder<Piglin> {
    public PiglinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.PIGLIN;
    }

    @Override
    protected Icon getBabyIcon(Piglin entity) {
        return MobIcon.PIGLIN_BABY;
    }
}
