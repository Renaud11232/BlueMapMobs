package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.IronGolem;

public class IronGolemMarkerBuilder extends SingleIconMobEntityMarkerBuilder<IronGolem> {
    public IronGolemMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.iron_golem", Icon.IRON_GOLEM);
    }
}
