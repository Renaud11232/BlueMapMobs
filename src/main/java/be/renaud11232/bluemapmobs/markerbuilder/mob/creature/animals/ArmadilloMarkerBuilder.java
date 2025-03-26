package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Armadillo;

public class ArmadilloMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Armadillo> {
    public ArmadilloMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.armadillo", Icon.ARMADILLO);
    }
}
