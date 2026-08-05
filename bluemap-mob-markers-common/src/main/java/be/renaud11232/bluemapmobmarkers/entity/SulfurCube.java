package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface SulfurCube extends Ageable {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.SULFUR_CUBE;
    }
}
