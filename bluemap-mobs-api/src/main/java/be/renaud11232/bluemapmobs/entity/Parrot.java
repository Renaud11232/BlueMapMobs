package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Parrot extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.PARROT;
    }

    Variant getVariant();

    enum Variant {
        RED,
        BLUE,
        GREEN,
        CYAN,
        GRAY
    }
}
