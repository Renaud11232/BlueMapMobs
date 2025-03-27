package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class ZombieMarkerBuilder extends MobEntityMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ZOMBIE, MobIcon.ZOMBIE);
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder(config));
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder(config));
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder(config));
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder(config));
    }
}
