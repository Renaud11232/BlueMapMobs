package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Goat;

import java.util.Optional;

public class GoatMarkerBuilder extends MobEntityMarkerBuilder<Goat> {

    public GoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Goat mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.GOAT.getPath(), Icon.GOAT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.goat", true);
    }
}
