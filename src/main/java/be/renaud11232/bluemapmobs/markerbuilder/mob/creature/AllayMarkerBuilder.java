package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Allay;

public class AllayMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Allay> {

    public AllayMarkerBuilder(FileConfiguration config) {
        super(config, Icon.ALLAY);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.allay", true);
    }
}
