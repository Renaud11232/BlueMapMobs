package be.renaud11232.bluemapmobs.markerbuilder.impl.other;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractOtherEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.other.livingentity.ArmorStandMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.LivingEntity;

public class LivingEntityMarkerBuilder extends AbstractOtherEntityMarkerBuilder<LivingEntity> {
    public LivingEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<LivingEntity> registry) {
        registry.register(ArmorStand.class, new ArmorStandMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
