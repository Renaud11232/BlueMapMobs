package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sniffer;

public class SnifferMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Sniffer> {
    public SnifferMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.sniffer", Icon.SNIFFER);
    }
}
