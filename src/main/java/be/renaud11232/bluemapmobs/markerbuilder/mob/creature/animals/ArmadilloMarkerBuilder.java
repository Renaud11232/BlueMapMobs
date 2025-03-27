package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Armadillo;

public class ArmadilloMarkerBuilder extends MobEntityMarkerBuilder<Armadillo> {
    public ArmadilloMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ARMADILLO, BlueMapMobsIcon.Mob.ARMADILLO);
    }
}
