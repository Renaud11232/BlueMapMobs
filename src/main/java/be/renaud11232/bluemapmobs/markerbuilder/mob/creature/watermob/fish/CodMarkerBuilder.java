package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cod;

public class CodMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Cod> {
    public CodMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.cod", Icon.COD);
    }
}
