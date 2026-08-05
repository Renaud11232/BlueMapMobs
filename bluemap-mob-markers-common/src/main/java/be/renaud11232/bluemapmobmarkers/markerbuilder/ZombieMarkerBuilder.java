package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Zombie;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZombieMarkerBuilder extends AgeableMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.ZOMBIE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.ZOMBIE_BABY;
    }
}
