package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.flying.GhastMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.flying.PhantomMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Flying;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Phantom;

public class FlyingMarkerBuilder extends AbstractMobMarkerBuilder<Flying> {
    public FlyingMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Flying> registry) {
        registry.register(Ghast.class, new GhastMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Phantom.class, new PhantomMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
