package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

public class FrogMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.frog", Frog::getVariant);
        registerIcon(Frog.Variant.COLD, Icon.COLD_FROG);
        registerIcon(Frog.Variant.WARM, Icon.TROPICAL_FROG);
        registerIcon(Frog.Variant.TEMPERATE, Icon.TEMPERATE_FROG);
    }
}
