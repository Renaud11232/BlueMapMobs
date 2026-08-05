package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Axolotl extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.AXOLOTL;
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
