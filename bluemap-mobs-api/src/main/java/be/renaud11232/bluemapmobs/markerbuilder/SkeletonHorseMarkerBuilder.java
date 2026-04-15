package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.SkeletonHorse;

public class SkeletonHorseMarkerBuilder extends AgeableMarkerBuilder<SkeletonHorse> {
    public SkeletonHorseMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SKELETON_HORSE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: Add baby variant
        return super.getDefaultBabyIcon();
    }
}
