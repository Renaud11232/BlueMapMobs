package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Turtle;

import java.util.Optional;

public class TurtleMarkerBuilder extends MobEntityMarkerBuilder<Turtle> {

    public TurtleMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Turtle mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.TURTLE.getPath(), Icon.TURTLE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.turtle", true);
    }
}
