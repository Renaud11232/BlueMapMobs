package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Pig extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.PIG;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM,
        COLD
    }
}
