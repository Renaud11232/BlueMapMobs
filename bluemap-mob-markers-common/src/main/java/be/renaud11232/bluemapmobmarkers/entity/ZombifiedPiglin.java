package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface ZombifiedPiglin extends Zombie {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.ZOMBIFIED_PIGLIN;
    }
}
