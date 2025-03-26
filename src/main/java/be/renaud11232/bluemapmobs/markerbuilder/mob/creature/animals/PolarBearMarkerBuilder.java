package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PolarBear;

public class PolarBearMarkerBuilder extends SingleIconMobEntityMarkerBuilder<PolarBear> {
    public PolarBearMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.polar_bear", Icon.POLAR_BEAR);
    }
}
