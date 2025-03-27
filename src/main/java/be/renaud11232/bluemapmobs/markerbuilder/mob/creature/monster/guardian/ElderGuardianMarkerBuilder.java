package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;

public class ElderGuardianMarkerBuilder extends MobEntityMarkerBuilder<ElderGuardian> {
    public ElderGuardianMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ELDER_GUARDIAN, BlueMapMobsIcon.Mob.ELDER_GUARDIAN);
    }
}
