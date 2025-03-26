package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vex;

public class VexMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Vex> {
    public VexMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.vex", Icon.VEX);
    }
}
