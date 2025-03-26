package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Giant;

public class GiantMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Giant> {
    public GiantMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.giant", Icon.GIANT);
    }
}
