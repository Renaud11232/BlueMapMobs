package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import io.papermc.paper.world.WeatheringCopperState;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CopperGolem;

public class CopperGolemMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<CopperGolem, WeatheringCopperState> {
    public CopperGolemMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COPPER_GOLEM;
    }

    @Override
    public WeatheringCopperState getVariant(CopperGolem copperGolem) {
        return copperGolem.getWeatheringState();
    }

    @Override
    public void registerVariantIcons(Registry<WeatheringCopperState, Icon> registry) {
        registry.register(WeatheringCopperState.UNAFFECTED, BlueMapMobsIcon.Mob.UNAFFECTED_COPPER_GOLEM);
        registry.register(WeatheringCopperState.EXPOSED, BlueMapMobsIcon.Mob.EXPOSED_COPPER_GOLEM);
        registry.register(WeatheringCopperState.WEATHERED, BlueMapMobsIcon.Mob.WEATHERED_COPPER_GOLEM);
        registry.register(WeatheringCopperState.OXIDIZED, BlueMapMobsIcon.Mob.OXIDIZED_COPPER_GOLEM);
    }
}
