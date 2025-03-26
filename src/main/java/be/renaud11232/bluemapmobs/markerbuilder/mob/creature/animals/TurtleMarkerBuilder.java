package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Turtle;

public class TurtleMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Turtle> {
    public TurtleMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.turtle", Icon.TURTLE);
    }
}
