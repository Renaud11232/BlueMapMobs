package be.renaud11232.bluemapmobs.markerbuilder.mob.flying;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Phantom;

public class PhantomMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Phantom> {
    public PhantomMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.phantom", Icon.PHANTOM);
    }
}
