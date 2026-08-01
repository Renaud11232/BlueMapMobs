package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.SkeletonHorse;

public class SkeletonHorseMarkerBuilder extends AgeableMarkerBuilder<SkeletonHorse> {
    public SkeletonHorseMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SKELETON_HORSE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.SKELETON_HORSE_BABY;
    }
}
