package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

public class CowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.COW, Cow::getVariant);
        registerIcon(Cow.Variant.TEMPERATE, MobIcon.TEMPERATE_COW);
        registerIcon(Cow.Variant.COLD, MobIcon.COLD_COW);
        registerIcon(Cow.Variant.WARM, MobIcon.WARM_COW);
    }
}
