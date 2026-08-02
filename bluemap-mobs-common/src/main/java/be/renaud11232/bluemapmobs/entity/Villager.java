package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Villager extends AbstractVillager {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.VILLAGER;
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
