package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PiglinBrute;

public class PiglinBruteMarkerBuilder extends MobEntityMarkerBuilder<PiglinBrute> {
    public PiglinBruteMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PIGLIN_BRUTE, BlueMapMobsIcon.Mob.PIGLIN_BRUTE);
    }
}
