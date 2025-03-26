package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PigMarkerBuilder extends MobEntityMarkerBuilder<Pig> {

    private final Map<Pig.Variant, Icon> pigIcons;

    public PigMarkerBuilder(FileConfiguration config) {
        super(config);
        pigIcons = new HashMap<>();
        pigIcons.put(Pig.Variant.TEMPERATE, Icon.TEMPERATE_PIG);
        pigIcons.put(Pig.Variant.COLD, Icon.COLD_PIG);
        pigIcons.put(Pig.Variant.WARM, Icon.WARM_PIG);
    }

    @Override
    public Optional<POIMarker> buildDefault(Pig pig) {
        return super.buildDefault(pig).map(marker -> {
            Icon icon = pigIcons.get(pig.getVariant());
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.pig", true);
    }
}
