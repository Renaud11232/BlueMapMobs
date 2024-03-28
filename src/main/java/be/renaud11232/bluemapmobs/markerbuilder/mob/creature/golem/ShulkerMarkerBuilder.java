package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Shulker;

import java.util.Optional;

public class ShulkerMarkerBuilder extends MobEntityMarkerBuilder<Shulker> {

    public ShulkerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Shulker mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SHULKER.getPath(), Icon.SHULKER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.shulker", true);
    }
}
