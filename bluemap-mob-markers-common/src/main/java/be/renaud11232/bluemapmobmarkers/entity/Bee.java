package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Bee extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.BEE;
    }

    boolean hasNectar();

    boolean isAngry();
}
