package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.DolphinMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.FishMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.SquidMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Squid;
import org.bukkit.entity.WaterMob;

public class WaterMobMarkerBuilder extends AbstractMobMarkerBuilder<WaterMob> {
    public WaterMobMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<WaterMob> registry) {
        registry.register(Dolphin.class, new DolphinMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Fish.class, new FishMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Squid.class, new SquidMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
