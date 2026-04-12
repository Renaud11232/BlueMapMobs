package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface PiglinBrute extends AbstractPiglin {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.PIGLIN_BRUTE;
    }
}
