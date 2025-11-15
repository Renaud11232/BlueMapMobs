package be.renaud11232.bluemapmobs.plugin.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MobMarkerBuilder extends AbstractMobMarkerBuilder<Mob> {

    public MobMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Mob> registry) {
        registry.register(Ambient.class, new AmbientMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Creature.class, new CreatureMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(EnderDragon.class, new EnderDragonMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Flying.class, new FlyingMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Slime.class, new SlimeMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
