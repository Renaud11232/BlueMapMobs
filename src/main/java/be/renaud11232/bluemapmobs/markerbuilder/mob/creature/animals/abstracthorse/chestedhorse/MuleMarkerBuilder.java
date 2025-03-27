package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mule;

public class MuleMarkerBuilder extends MobEntityMarkerBuilder<Mule> {
    public MuleMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.MULE, BlueMapMobsIcon.Mob.MULE);
    }
}
