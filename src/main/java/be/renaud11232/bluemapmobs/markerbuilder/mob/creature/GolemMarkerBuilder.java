package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.IronGolemMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.ShulkerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem.SnowmanMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Golem;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Shulker;
import org.bukkit.entity.Snowman;

public class GolemMarkerBuilder extends MobEntityMarkerBuilder<Golem> {
    public GolemMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Golem> registry) {
        registry.register(IronGolem.class, new IronGolemMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Shulker.class, new ShulkerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Snowman.class, new SnowmanMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
