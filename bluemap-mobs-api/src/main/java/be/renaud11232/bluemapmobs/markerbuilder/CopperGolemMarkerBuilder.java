package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.CopperGolem;

public class CopperGolemMarkerBuilder extends SimpleSingleVariantMarkerBuilder<CopperGolem, CopperGolem.CopperWeatherState> {
    public CopperGolemMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(CopperGolem.CopperWeatherState.UNAFFECTED, MobsIcon.UNAFFECTED_COPPER_GOLEM);
        registerVariantIcon(CopperGolem.CopperWeatherState.EXPOSED, MobsIcon.EXPOSED_COPPER_GOLEM);
        registerVariantIcon(CopperGolem.CopperWeatherState.WEATHERED, MobsIcon.WEATHERED_COPPER_GOLEM);
        registerVariantIcon(CopperGolem.CopperWeatherState.OXIDIZED, MobsIcon.OXIDIZED_COPPER_GOLEM);
    }

    @Override
    protected CopperGolem.CopperWeatherState getVariant(CopperGolem copperGolem) {
        return copperGolem.getWeatherState();
    }
}
