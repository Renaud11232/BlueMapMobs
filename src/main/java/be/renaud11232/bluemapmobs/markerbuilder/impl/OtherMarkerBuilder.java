package be.renaud11232.bluemapmobs.markerbuilder.impl;

import be.renaud11232.bluemapmobs.markerbuilder.OtherEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.other.LivingEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class OtherMarkerBuilder extends OtherEntityMarkerBuilder<Entity> {
    public OtherMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Entity> registry) {
        registry.register(LivingEntity.class, new LivingEntityMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
