package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class ZombieMarkerBuilder extends MobEntityMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE, BlueMapMobsIcon.Mob.ZOMBIE);
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder(config, defaultConfig));
    }
}
