package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Axolotl extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.AXOLOTL;
    }

    Variant getVariant();

    enum Variant {
        LUCY,
        WILD,
        GOLD,
        CYAN,
        BLUE
    }
}
