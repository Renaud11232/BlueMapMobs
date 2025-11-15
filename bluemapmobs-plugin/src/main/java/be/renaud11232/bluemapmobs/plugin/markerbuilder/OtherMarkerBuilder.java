package be.renaud11232.bluemapmobs.plugin.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractOtherEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.other.LivingEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class OtherMarkerBuilder extends AbstractOtherEntityMarkerBuilder<Entity> {
    public OtherMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Entity> registry) {
        registry.register(LivingEntity.class, new LivingEntityMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
