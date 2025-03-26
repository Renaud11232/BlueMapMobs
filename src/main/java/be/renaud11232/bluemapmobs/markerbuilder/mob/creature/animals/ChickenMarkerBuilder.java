package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

public class ChickenMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(FileConfiguration config) {
        super(config, Chicken::getVariant);
        registerIcon(Chicken.Variant.TEMPERATE, Icon.TEMPERATE_CHICKEN);
        registerIcon(Chicken.Variant.COLD, Icon.COLD_CHICKEN);
        registerIcon(Chicken.Variant.WARM, Icon.WARM_CHICKEN);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.chicken", true);
    }
}
