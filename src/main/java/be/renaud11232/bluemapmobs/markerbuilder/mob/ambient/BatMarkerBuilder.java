package be.renaud11232.bluemapmobs.markerbuilder.mob.ambient;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bat;

public class BatMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Bat> {
    public BatMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.bat", Icon.BAT);
    }
}
