package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

public class CowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(FileConfiguration config) {
        super(config, Cow::getVariant);
        registerIcon(Cow.Variant.TEMPERATE, Icon.TEMPERATE_COW);
        registerIcon(Cow.Variant.COLD, Icon.COLD_COW);
        registerIcon(Cow.Variant.WARM, Icon.WARM_COW);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cow", true);
    }
}
