package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Warden;

public class WardenMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Warden> {
    public WardenMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.warden", Icon.WARDEN);
    }
}
