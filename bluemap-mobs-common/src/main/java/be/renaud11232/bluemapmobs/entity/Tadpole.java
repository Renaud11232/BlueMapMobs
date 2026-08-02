package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Tadpole extends Fish {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.TADPOLE;
    }
}
