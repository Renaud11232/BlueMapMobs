package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

public class SnowmanMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Snowman, Boolean> {
    public SnowmanMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SNOWMAN;
    }

    @Override
    public Boolean getVariant(Snowman snowman) {
        return snowman.isDerp();
    }

    @Override
    public void registerVariantIcons(Registry<Boolean, Icon> registry) {
        registry.register(true, BlueMapMobsIcon.Mob.DERP_SNOWMAN);
        registry.register(false, BlueMapMobsIcon.Mob.NORMAL_SNOWMAN);
    }
}
