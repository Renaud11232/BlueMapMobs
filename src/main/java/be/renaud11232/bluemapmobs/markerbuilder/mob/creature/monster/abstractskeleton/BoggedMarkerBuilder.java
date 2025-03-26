package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bogged;

public class BoggedMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Bogged> {
    public BoggedMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.bogged", Icon.BOGGED);
    }
}
