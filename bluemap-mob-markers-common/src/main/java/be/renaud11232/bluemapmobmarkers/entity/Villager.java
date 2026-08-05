package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Villager extends AbstractVillager {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.VILLAGER;
    }

    Type getType();

    enum Type {
        DESERT,
        JUNGLE,
        PLAINS,
        SAVANNA,
        SNOW,
        SWAMP,
        TAIGA
    }
}
