package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Dolphin;

public class DolphinMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Dolphin> {
    public DolphinMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.dolphin", Icon.DOLPHIN);
    }
}
