package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Camel;

import java.util.Optional;

public class CamelMarkerBuilder extends MobEntityMarkerBuilder<Camel> {

    public CamelMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Camel mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.CAMEL.getPath(), Icon.CAMEL.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.camel", true);
    }
}
