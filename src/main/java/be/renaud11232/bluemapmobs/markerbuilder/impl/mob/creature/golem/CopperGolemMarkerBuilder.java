package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CopperGolem;

public class CopperGolemMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<CopperGolem, CopperGolem.CopperWeatherState> {
    public CopperGolemMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COPPER_GOLEM;
    }

    @Override
    public CopperGolem.CopperWeatherState getVariant(CopperGolem copperGolem) {
        return copperGolem.getWeatherState();
    }

    @Override
    public void registerVariantIcons(Registry<CopperGolem.CopperWeatherState, Icon> registry) {
        registry.register(CopperGolem.CopperWeatherState.UNAFFECTED, BlueMapMobsIcon.Mob.UNAFFECTED_COPPER_GOLEM);
        registry.register(CopperGolem.CopperWeatherState.EXPOSED, BlueMapMobsIcon.Mob.EXPOSED_COPPER_GOLEM);
        registry.register(CopperGolem.CopperWeatherState.WEATHERED, BlueMapMobsIcon.Mob.WEATHERED_COPPER_GOLEM);
        registry.register(CopperGolem.CopperWeatherState.OXIDIZED, BlueMapMobsIcon.Mob.OXIDIZED_COPPER_GOLEM);
    }
}
