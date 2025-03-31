package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.mob.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MobMarkerBuilder extends MobEntityMarkerBuilder<Mob> {

    public MobMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Mob> registry) {
        registry.register(Ambient.class, new AmbientMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Creature.class, new CreatureMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(EnderDragon.class, new EnderDragonMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Flying.class, new FlyingMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Slime.class, new SlimeMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
