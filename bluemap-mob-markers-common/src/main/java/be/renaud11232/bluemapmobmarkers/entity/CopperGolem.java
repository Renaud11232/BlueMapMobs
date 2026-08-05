package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface CopperGolem extends Golem {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.COPPER_GOLEM;
    }

    CopperWeatherState getWeatherState();

    enum CopperWeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED
    }
}
