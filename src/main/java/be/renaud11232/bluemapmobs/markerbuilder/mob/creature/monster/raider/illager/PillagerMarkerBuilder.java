package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pillager;

public class PillagerMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Pillager> {
    public PillagerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.pillager", Icon.PILLAGER);
    }
}
