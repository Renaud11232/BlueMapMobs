package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.watermob.fish.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class FishMarkerBuilder extends AbstractMobMarkerBuilder<Fish> {
    public FishMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Fish> registry) {
        registry.register(Cod.class, new CodMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PufferFish.class, new PufferFishMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Salmon.class, new SalmonMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Tadpole.class, new TadpoleMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(TropicalFish.class, new TropicalFishMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
