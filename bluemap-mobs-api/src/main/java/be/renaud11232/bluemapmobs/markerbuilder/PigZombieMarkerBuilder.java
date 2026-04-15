package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.PigZombie;

public class PigZombieMarkerBuilder extends AgeableMarkerBuilder<PigZombie> {
    public PigZombieMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.PIG_ZOMBIE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: add baby icon
        return super.getDefaultBabyIcon();
    }
}
