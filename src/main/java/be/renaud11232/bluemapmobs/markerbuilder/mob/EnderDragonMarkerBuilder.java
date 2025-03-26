package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EnderDragon;

public class EnderDragonMarkerBuilder extends SingleIconMobEntityMarkerBuilder<EnderDragon> {
    public EnderDragonMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.ender_dragon", Icon.ENDER_DRAGON);
    }
}
