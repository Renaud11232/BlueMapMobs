package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Endermite;

import java.util.Optional;

public class EndermiteMarkerBuilder extends MobEntityMarkerBuilder<Endermite> {

    public EndermiteMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Endermite mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ENDERMITE.getPath(), Icon.ENDERMITE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.endermite", true);
    }
}
