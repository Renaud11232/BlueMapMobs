package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.Optional;

public class WolfMarkerBuilder extends MobEntityMarkerBuilder<Wolf> {

    public WolfMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Wolf wolf) {
        return super.buildDefault(wolf).map(marker -> {
            Icon icon;
            if(wolf.isTamed()) {
                icon = Icon.TAMED_WOLF;
            } else {
                icon = Icon.UNTAMED_WOLF;
            }
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.wolf", true);
    }
}
