package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface CopperGolem extends Golem {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.COPPER_GOLEM;
    }

    CopperWeatherState getWeatherState();

    enum CopperWeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED
    }
}
