package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractnautilus.NautilusMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractnautilus.ZombieNautilusMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractNautilus;
import org.bukkit.entity.Nautilus;
import org.bukkit.entity.ZombieNautilus;

public class AbstractNautilusMarkerBuilder extends AbstractMobMarkerBuilder<AbstractNautilus> {
    public AbstractNautilusMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractNautilus> registry) {
        registry.register(Nautilus.class, new NautilusMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(ZombieNautilus.class, new ZombieNautilusMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
