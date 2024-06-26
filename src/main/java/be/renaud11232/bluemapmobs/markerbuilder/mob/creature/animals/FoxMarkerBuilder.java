package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

import java.util.Optional;

public class FoxMarkerBuilder extends MobEntityMarkerBuilder<Fox> {

    public FoxMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Fox fox) {
        return super.buildDefault(fox).map(marker -> {
            Icon icon = switch (fox.getFoxType()) {
                case RED -> Icon.RED_FOX;
                case SNOW -> Icon.SNOW_FOX;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.fox", true);
    }
}
