package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Husk;

public class HuskMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Husk> {
    public HuskMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.husk", Icon.HUSK);
    }
}
