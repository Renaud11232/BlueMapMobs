package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Warden;

import java.util.Optional;

public class WardenMarkerBuilder extends MobEntityMarkerBuilder<Warden> {

    public WardenMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Warden mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.WARDEN.getPath(), Icon.WARDEN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.warden", true);
    }
}
