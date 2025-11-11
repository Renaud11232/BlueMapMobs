package be.renaud11232.bluemapmobs.markerbuilder.impl.mob;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.ambient.BatMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ambient;
import org.bukkit.entity.Bat;

public class AmbientMarkerBuilder extends AbstractMobMarkerBuilder<Ambient> {
    public AmbientMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Ambient> registry) {
        registry.register(Bat.class, new BatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
