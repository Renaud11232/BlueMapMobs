package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface SkeletonHorse extends AbstractHorse {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.SKELETON_HORSE;
    }
}
