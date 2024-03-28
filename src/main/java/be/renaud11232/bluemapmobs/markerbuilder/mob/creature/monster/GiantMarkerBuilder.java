package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Giant;

import java.util.Optional;

public class GiantMarkerBuilder extends MobEntityMarkerBuilder<Giant> {

    public GiantMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Giant mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.GIANT.getPath(), Icon.GIANT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.giant", true);
    }
}
