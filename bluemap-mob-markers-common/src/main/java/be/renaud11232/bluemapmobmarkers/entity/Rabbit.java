package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Rabbit extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.RABBIT;
    }

    Type getType();

    enum Type {
        BROWN,
        WHITE,
        BLACK,
        BLACK_AND_WHITE,
        GOLD,
        SALT_AND_PEPPER,
        THE_KILLER_BUNNY
    }
}
