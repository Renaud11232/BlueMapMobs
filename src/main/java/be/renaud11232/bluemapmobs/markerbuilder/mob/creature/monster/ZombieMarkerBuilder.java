package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class ZombieMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.zombie", Icon.ZOMBIE);
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder(config));
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder(config));
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder(config));
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder(config));
    }
}
