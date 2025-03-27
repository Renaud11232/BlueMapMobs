package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

public class PigMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PIG, Pig::getVariant);
        registerIcon(Pig.Variant.TEMPERATE, MobIcon.TEMPERATE_PIG);
        registerIcon(Pig.Variant.COLD, MobIcon.COLD_PIG);
        registerIcon(Pig.Variant.WARM, MobIcon.WARM_PIG);
    }
}
