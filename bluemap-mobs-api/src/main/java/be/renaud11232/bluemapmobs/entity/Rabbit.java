package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Rabbit extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.RABBIT;
    }

    Type getType();

    enum Type {
        BROWN,
        WHITE,
        BLACK,
        BLACK_AND_WHITE,
        GOLD,
        SALT_AND_PEPPER,
        THE_KILLER_BUNNY;
    }
}
