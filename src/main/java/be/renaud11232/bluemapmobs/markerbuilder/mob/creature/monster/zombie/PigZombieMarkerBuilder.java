package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PigZombie;

public class PigZombieMarkerBuilder extends MobEntityMarkerBuilder<PigZombie> {
    public PigZombieMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PIG_ZOMBIE, BlueMapMobsIcon.Mob.PIG_ZOMBIE);
    }
}
