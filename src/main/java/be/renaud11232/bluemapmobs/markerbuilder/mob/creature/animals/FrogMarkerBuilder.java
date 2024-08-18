package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FrogMarkerBuilder extends MobEntityMarkerBuilder<Frog> {

    private final Map<Frog.Variant, Icon> icons = new HashMap<>();

    public FrogMarkerBuilder(FileConfiguration config) {
        super(config);
        icons.put(Frog.Variant.COLD, Icon.COLD_FROG);
        icons.put(Frog.Variant.WARM, Icon.TROPICAL_FROG);
        icons.put(Frog.Variant.TEMPERATE, Icon.TEMPERATE_FROG);
    }

    @Override
    public Optional<POIMarker> buildDefault(Frog frog) {
        return super.buildDefault(frog).map(marker -> {
            Icon icon = icons.getOrDefault(frog.getVariant(), Icon.UNKNOWN);
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.frog", true);
    }
}
