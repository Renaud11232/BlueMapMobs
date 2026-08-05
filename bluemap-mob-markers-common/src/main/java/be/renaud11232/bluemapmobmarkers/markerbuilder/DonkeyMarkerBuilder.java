package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Donkey;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class DonkeyMarkerBuilder extends AgeableMarkerBuilder<Donkey> {
    public DonkeyMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.DONKEY;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.DONKEY_BABY;
    }
}
