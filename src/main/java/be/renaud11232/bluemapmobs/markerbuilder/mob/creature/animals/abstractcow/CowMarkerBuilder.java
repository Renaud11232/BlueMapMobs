package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CowMarkerBuilder extends MobEntityMarkerBuilder<Cow> {

    private final Map<Cow.Variant, Icon> cowIcons;

    public CowMarkerBuilder(FileConfiguration config) {
        super(config);
        cowIcons = new HashMap<>();
        cowIcons.put(Cow.Variant.TEMPERATE, Icon.TEMPERATE_COW);
        cowIcons.put(Cow.Variant.COLD, Icon.COLD_COW);
        cowIcons.put(Cow.Variant.WARM, Icon.WARM_COW);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cow cow) {
        return super.buildDefault(cow).map(marker -> {
            Icon icon = cowIcons.get(cow.getVariant());
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cow", true);
    }
}
