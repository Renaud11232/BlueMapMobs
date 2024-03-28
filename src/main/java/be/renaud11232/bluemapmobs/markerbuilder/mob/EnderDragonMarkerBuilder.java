package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EnderDragon;

import java.util.Optional;

public class EnderDragonMarkerBuilder extends MobEntityMarkerBuilder<EnderDragon> {

    public EnderDragonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(EnderDragon mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ENDER_DRAGON.getPath(), Icon.ENDER_DRAGON.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.ender_dragon", true);
    }
}
