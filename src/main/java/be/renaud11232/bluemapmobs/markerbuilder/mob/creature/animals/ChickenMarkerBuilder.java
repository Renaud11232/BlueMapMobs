package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

public class ChickenMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.CHICKEN, Chicken::getVariant);
        registerIcon(Chicken.Variant.TEMPERATE, MobIcon.TEMPERATE_CHICKEN);
        registerIcon(Chicken.Variant.COLD, MobIcon.COLD_CHICKEN);
        registerIcon(Chicken.Variant.WARM, MobIcon.WARM_CHICKEN);
    }
}
