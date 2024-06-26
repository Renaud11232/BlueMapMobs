package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

import java.util.Optional;

public class SnowmanMarkerBuilder extends MobEntityMarkerBuilder<Snowman> {

    public SnowmanMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Snowman mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SNOWMAN.getPath(), Icon.SNOWMAN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.snowman", true);
    }
}
