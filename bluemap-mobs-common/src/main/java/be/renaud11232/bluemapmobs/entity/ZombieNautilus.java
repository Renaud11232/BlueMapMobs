package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface ZombieNautilus extends AbstractNautilus {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.ZOMBIE_NAUTILUS;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM
    }
}
