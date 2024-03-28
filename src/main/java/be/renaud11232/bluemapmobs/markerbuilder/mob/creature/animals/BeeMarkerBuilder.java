package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bee;

import java.util.Optional;

public class BeeMarkerBuilder extends MobEntityMarkerBuilder<Bee> {

    public BeeMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Bee mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.BEE.getPath(), Icon.BEE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.bee", true);
    }
}
