package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Wolf extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.WOLF;
    }

    boolean isAngry();

    boolean isTamed();

    Variant getVariant();

    enum Variant {
        PALE,
        SPOTTED,
        SNOWY,
        BLACK,
        ASHEN,
        RUSTY,
        WOODS,
        CHESTNUT,
        STRIPED
    }
}
