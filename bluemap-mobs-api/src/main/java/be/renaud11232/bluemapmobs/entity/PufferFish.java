package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface PufferFish extends Fish {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.PUFFER_FISH;
    }
}
