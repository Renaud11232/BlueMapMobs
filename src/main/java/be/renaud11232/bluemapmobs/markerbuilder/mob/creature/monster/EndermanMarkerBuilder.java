package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Enderman;

import java.util.Optional;

public class EndermanMarkerBuilder extends MobEntityMarkerBuilder<Enderman> {

    public EndermanMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Enderman mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ENDERMAN.getPath(), Icon.ENDERMAN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.enderman", true);
    }
}
