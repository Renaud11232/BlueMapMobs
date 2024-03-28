package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Strider;

import java.util.Optional;

public class StriderMarkerBuilder extends MobEntityMarkerBuilder<Strider> {

    public StriderMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Strider mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.STRIDER.getPath(), Icon.STRIDER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.strider", true);
    }
}
