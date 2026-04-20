package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombieHorse;

public class ZombieHorseMarkerBuilder extends AgeableMarkerBuilder<ZombieHorse> {
    public ZombieHorseMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
