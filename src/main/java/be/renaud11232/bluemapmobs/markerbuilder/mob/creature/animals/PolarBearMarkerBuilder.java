package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PolarBear;

import java.util.Optional;

public class PolarBearMarkerBuilder extends MobEntityMarkerBuilder<PolarBear> {

    public PolarBearMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PolarBear mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.POLAR_BEAR.getPath(), Icon.POLAR_BEAR.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.polar_bear", true);
    }
}
