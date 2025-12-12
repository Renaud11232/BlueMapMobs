package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstracthorse.camel.CamelHuskMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Camel;
import org.bukkit.entity.CamelHusk;

public class CamelMarkerBuilder extends AbstractMobMarkerBuilder<Camel> {
    public CamelMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Camel> registry) {
        registry.register(CamelHusk.class, new CamelHuskMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CAMEL;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.CAMEL;
    }
}
