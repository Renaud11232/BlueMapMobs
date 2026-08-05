package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Cow extends AbstractCow {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.COW;
    }

    Variant getVariant();

    enum Variant {
        TEMPERATE,
        WARM,
        COLD
    }
}
