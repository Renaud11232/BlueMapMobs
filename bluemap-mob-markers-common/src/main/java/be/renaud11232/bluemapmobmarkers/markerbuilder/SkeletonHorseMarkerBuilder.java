package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.SkeletonHorse;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SkeletonHorseMarkerBuilder extends AgeableMarkerBuilder<SkeletonHorse> {
    public SkeletonHorseMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.SKELETON_HORSE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.SKELETON_HORSE_BABY;
    }
}
