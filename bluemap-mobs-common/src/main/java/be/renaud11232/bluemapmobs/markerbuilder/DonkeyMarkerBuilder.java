package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Donkey;

public class DonkeyMarkerBuilder extends AgeableMarkerBuilder<Donkey> {
    public DonkeyMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.DONKEY;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.DONKEY_BABY;
    }
}
