package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Salmon extends Fish {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.SALMON;
    }
}
