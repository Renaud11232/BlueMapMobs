package be.renaud11232.bluemapmobs.markerbuilder.mob.flying;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ghast;

import java.util.Optional;

public class GhastMarkerBuilder extends MobEntityMarkerBuilder<Ghast> {

    public GhastMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Ghast mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.GHAST.getPath(), Icon.GHAST.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.ghast", true);
    }
}
