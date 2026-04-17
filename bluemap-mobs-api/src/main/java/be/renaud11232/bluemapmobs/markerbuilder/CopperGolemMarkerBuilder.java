package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.CopperGolem;

public class CopperGolemMarkerBuilder extends MobSingleVariantMarkerBuilder<CopperGolem, CopperGolem.CopperWeatherState> {
    public CopperGolemMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(CopperGolem.CopperWeatherState.UNAFFECTED, MobsIcon.COPPER_GOLEM_UNAFFECTED);
        registerVariantIcon(CopperGolem.CopperWeatherState.EXPOSED, MobsIcon.COPPER_GOLEM_EXPOSED);
        registerVariantIcon(CopperGolem.CopperWeatherState.WEATHERED, MobsIcon.COPPER_GOLEM_WEATHERED);
        registerVariantIcon(CopperGolem.CopperWeatherState.OXIDIZED, MobsIcon.COPPER_GOLEM_OXIDIZED);
    }

    @Override
    protected CopperGolem.CopperWeatherState getVariant(CopperGolem copperGolem) {
        return copperGolem.getWeatherState();
    }
}
