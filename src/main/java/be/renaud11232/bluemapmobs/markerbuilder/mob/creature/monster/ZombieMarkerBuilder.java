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
    public ZombieMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE, BlueMapMobsIcon.Mob.ZOMBIE);
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder(config));
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder(config));
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder(config));
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder(config));
    }
}
