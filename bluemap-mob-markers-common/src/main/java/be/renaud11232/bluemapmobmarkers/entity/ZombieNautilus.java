package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface ZombieNautilus extends AbstractNautilus {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.ZOMBIE_NAUTILUS;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM
    }
}
