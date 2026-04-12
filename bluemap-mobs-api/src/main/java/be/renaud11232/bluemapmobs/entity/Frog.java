package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Frog extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.FROG;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM,
        COLD
    }
}
