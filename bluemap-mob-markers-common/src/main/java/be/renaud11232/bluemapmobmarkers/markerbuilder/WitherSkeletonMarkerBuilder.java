package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.WitherSkeleton;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class WitherSkeletonMarkerBuilder extends MobMarkerBuilder<WitherSkeleton> {
    public WitherSkeletonMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.WITHER_SKELETON;
    }
}
