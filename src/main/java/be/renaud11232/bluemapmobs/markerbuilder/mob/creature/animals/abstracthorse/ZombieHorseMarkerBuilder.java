package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ZombieHorse;

public class ZombieHorseMarkerBuilder extends MobEntityMarkerBuilder<ZombieHorse> {
    public ZombieHorseMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ZOMBIE_HORSE, MobIcon.ZOMBIE_HORSE);
    }
}
