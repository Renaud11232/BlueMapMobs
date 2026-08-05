package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Fox extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.FOX;
    }

    Type getType();

    boolean isSleeping();

    enum Type {
        RED,
        SNOW
    }
}
