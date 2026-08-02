package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Wolf extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.WOLF;
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
