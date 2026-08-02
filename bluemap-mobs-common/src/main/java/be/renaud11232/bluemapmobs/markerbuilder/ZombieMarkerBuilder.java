package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Zombie;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZombieMarkerBuilder extends AgeableMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ZOMBIE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.ZOMBIE_BABY;
    }
}
