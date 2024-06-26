package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

import java.util.Optional;

public class ChickenMarkerBuilder extends MobEntityMarkerBuilder<Chicken> {

    public ChickenMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Chicken mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.CHICKEN.getPath(), Icon.CHICKEN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.chicken", true);
    }
}
