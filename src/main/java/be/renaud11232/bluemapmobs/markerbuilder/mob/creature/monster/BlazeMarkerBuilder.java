package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Blaze;

import java.util.Optional;

public class BlazeMarkerBuilder extends MobEntityMarkerBuilder<Blaze> {

    public BlazeMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Blaze mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.BLAZE.getPath(), Icon.BLAZE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.blaze", true);
    }
}
