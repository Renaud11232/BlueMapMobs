package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sniffer;

import java.util.Optional;

public class SnifferMarkerBuilder extends MobEntityMarkerBuilder<Sniffer> {

    public SnifferMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Sniffer mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SNIFFER.getPath(), Icon.SNIFFER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.sniffer", true);
    }
}
