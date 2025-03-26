package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PigZombie;

public class PigZombieMarkerBuilder extends SingleIconMobEntityMarkerBuilder<PigZombie> {
    public PigZombieMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.pig_zombie", Icon.PIG_ZOMBIE);
    }
}
