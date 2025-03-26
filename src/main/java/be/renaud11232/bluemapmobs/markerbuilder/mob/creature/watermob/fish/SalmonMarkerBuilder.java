package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Salmon;

public class SalmonMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Salmon> {
    public SalmonMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.salmon", Icon.SALMON);
    }
}
