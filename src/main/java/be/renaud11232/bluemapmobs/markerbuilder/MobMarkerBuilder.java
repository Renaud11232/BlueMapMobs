package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.mob.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MobMarkerBuilder extends MobEntityMarkerBuilder<Mob> {

    public MobMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Ambient.class, new AmbientMarkerBuilder(config));
        registerMarkerBuilder(Creature.class, new CreatureMarkerBuilder(config));
        registerMarkerBuilder(EnderDragon.class, new EnderDragonMarkerBuilder(config));
        registerMarkerBuilder(Flying.class, new FlyingMarkerBuilder(config));
        registerMarkerBuilder(Slime.class, new SlimeMarkerBuilder(config));
    }
}
