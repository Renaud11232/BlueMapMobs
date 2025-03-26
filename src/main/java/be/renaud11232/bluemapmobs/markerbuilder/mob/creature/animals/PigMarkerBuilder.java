package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

public class PigMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.pig", Pig::getVariant);
        registerIcon(Pig.Variant.TEMPERATE, Icon.TEMPERATE_PIG);
        registerIcon(Pig.Variant.COLD, Icon.COLD_PIG);
        registerIcon(Pig.Variant.WARM, Icon.WARM_PIG);
    }
}
