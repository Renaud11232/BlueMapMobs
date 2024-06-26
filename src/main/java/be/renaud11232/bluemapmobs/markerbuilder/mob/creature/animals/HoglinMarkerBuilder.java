package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Hoglin;

import java.util.Optional;

public class HoglinMarkerBuilder extends MobEntityMarkerBuilder<Hoglin> {

    public HoglinMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Hoglin mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.HOGLIN.getPath(), Icon.HOGLIN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.hoglin", true);
    }
}
