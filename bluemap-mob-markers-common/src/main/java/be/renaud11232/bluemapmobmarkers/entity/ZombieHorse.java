package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface ZombieHorse extends AbstractHorse {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.ZOMBIE_HORSE;
    }
}
