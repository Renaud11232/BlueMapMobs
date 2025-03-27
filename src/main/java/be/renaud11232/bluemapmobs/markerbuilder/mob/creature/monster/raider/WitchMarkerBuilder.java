package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Witch;

public class WitchMarkerBuilder extends MobEntityMarkerBuilder<Witch> {
    public WitchMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WITCH, BlueMapMobsIcon.Mob.WITCH);
    }
}
