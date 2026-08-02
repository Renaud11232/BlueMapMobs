package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombieHorse;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZombieHorseMarkerBuilder extends AgeableMarkerBuilder<ZombieHorse> {
    public ZombieHorseMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ZOMBIE_HORSE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.ZOMBIE_HORSE_BABY;
    }
}
