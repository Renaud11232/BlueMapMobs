package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.mob.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MobMarkerBuilder extends MobEntityMarkerBuilder<Mob> {

    public MobMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Ambient.class, new AmbientMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Creature.class, new CreatureMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(EnderDragon.class, new EnderDragonMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Flying.class, new FlyingMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Slime.class, new SlimeMarkerBuilder(config, defaultConfig));
    }
}
