package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Ravager extends Raider {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.RAVAGER;
    }
}
