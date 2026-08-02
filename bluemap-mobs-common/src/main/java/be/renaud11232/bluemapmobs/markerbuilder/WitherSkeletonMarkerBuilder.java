package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.WitherSkeleton;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class WitherSkeletonMarkerBuilder extends MobMarkerBuilder<WitherSkeleton> {
    public WitherSkeletonMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.WITHER_SKELETON;
    }
}
