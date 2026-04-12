package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface CaveSpider extends Spider {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.CAVE_SPIDER;
    }
}
