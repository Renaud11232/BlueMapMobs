package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Camel;

public class CamelMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Camel> {
    public CamelMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.camel", Icon.CAMEL);
    }
}
