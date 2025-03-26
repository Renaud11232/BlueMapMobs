package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Hoglin;

public class HoglinMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Hoglin> {
    public HoglinMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.hoglin", Icon.HOGLIN);
    }
}
