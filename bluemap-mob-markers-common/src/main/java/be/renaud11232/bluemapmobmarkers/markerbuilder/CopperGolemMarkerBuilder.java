package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.CopperGolem;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CopperGolemMarkerBuilder extends MobSingleVariantMarkerBuilder<CopperGolem, CopperGolem.CopperWeatherState> {
    public CopperGolemMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(CopperGolem.CopperWeatherState.UNAFFECTED, MobIcon.COPPER_GOLEM);
        registerVariantIcon(CopperGolem.CopperWeatherState.EXPOSED, MobIcon.COPPER_GOLEM_EXPOSED);
        registerVariantIcon(CopperGolem.CopperWeatherState.WEATHERED, MobIcon.COPPER_GOLEM_WEATHERED);
        registerVariantIcon(CopperGolem.CopperWeatherState.OXIDIZED, MobIcon.COPPER_GOLEM_OXIDIZED);
    }

    @Override
    protected CopperGolem.CopperWeatherState getVariant(CopperGolem copperGolem) {
        return copperGolem.getWeatherState();
    }
}
