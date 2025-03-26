package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChickenMarkerBuilder extends MobEntityMarkerBuilder<Chicken> {

    private final Map<Chicken.Variant, Icon> chickenIcons;

    public ChickenMarkerBuilder(FileConfiguration config) {
        super(config);
        chickenIcons = new HashMap<>();
        chickenIcons.put(Chicken.Variant.TEMPERATE, Icon.TEMPERATE_CHICKEN);
        chickenIcons.put(Chicken.Variant.COLD, Icon.COLD_CHICKEN);
        chickenIcons.put(Chicken.Variant.WARM, Icon.WARM_CHICKEN);
    }

    @Override
    public Optional<POIMarker> buildDefault(Chicken chicken) {
        return super.buildDefault(chicken).map(marker -> {
            Icon icon = chickenIcons.get(chicken.getVariant());
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.chicken", true);
    }
}
