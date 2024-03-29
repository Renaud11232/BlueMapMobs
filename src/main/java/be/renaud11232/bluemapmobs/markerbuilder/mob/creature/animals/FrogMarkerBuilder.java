package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

import java.util.Optional;

public class FrogMarkerBuilder extends MobEntityMarkerBuilder<Frog> {

    public FrogMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Frog frog) {
        return super.buildDefault(frog).map(marker -> {
            Icon icon = switch (frog.getVariant()) {
                case COLD -> Icon.COLD_FROG;
                case WARM -> Icon.TROPICAL_FROG;
                case TEMPERATE -> Icon.TEMPERATE_FROG;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.frog", true);
    }
}
