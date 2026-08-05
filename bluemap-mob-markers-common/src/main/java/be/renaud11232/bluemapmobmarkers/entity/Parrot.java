package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Parrot extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.PARROT;
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
