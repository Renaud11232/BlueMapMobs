package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ravager;

public class RavagerMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Ravager> {
    public RavagerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.ravager", Icon.RAVAGER);
    }
}
