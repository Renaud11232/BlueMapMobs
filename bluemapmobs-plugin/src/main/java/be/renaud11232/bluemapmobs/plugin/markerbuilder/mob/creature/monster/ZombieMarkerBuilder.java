package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class ZombieMarkerBuilder extends AbstractMobMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Zombie> registry) {
        registry.register(Drowned.class, new DrownedMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Husk.class, new HuskMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PigZombie.class, new PigZombieMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(ZombieVillager.class, new ZombieVillagerMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.ZOMBIE;
    }
}
