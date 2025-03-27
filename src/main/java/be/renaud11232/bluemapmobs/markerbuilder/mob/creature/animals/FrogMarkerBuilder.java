package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

public class FrogMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.FROG, Frog::getVariant);
        registerIcon(Frog.Variant.COLD, MobIcon.COLD_FROG);
        registerIcon(Frog.Variant.WARM, MobIcon.TROPICAL_FROG);
        registerIcon(Frog.Variant.TEMPERATE, MobIcon.TEMPERATE_FROG);
    }
}
