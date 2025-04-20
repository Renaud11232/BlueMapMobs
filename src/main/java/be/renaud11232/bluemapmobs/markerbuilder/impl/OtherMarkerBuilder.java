package be.renaud11232.bluemapmobs.markerbuilder.impl;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractOtherEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.other.LivingEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class OtherMarkerBuilder extends AbstractOtherEntityMarkerBuilder<Entity> {
    public OtherMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Entity> registry) {
        registry.register(LivingEntity.class, new LivingEntityMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
