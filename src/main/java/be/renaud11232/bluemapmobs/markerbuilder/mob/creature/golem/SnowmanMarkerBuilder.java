package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

public class SnowmanMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Snowman> {
    public SnowmanMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.snowman", Icon.SNOWMAN);
    }
}
