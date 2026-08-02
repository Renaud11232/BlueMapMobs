package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface MushroomCow extends AbstractCow {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.MUSHROOM_COW;
    }

    Variant getVariant();

    enum Variant {
        RED,
        BROWN
    }
}
