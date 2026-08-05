package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Chicken extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.CHICKEN;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM,
        COLD
    }
}
