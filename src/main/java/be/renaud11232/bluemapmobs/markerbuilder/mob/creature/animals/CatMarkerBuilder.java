package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

import java.util.Optional;

public class CatMarkerBuilder extends MobEntityMarkerBuilder<Cat> {

    public CatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cat mob) {
        return super.buildDefault(mob).map(marker -> {
            //TODO Cat colors
            marker.setIcon(Icon.CAT.getPath(), Icon.CAT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cat", true);
    }
}
