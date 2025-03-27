package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.IronGolemMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.ShulkerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.SnowmanMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Golem;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Shulker;
import org.bukkit.entity.Snowman;

public class GolemMarkerBuilder extends MobEntityMarkerBuilder<Golem> {
    public GolemMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(IronGolem.class, new IronGolemMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Shulker.class, new ShulkerMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Snowman.class, new SnowmanMarkerBuilder(config, defaultConfig));
    }
}
