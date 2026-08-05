package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface MushroomCow extends AbstractCow {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.MUSHROOM_COW;
    }

    Variant getVariant();

    enum Variant {
        RED,
        BROWN
    }
}
