package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Dolphin;

import java.util.Optional;

public class DolphinMarkerBuilder extends MobEntityMarkerBuilder<Dolphin> {

    public DolphinMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Dolphin mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.DOLPHIN.getPath(), Icon.DOLPHIN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.dolphin", true);
    }
}
