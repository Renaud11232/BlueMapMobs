package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

import java.util.Optional;

public class CreeperMarkerBuilder extends MobEntityMarkerBuilder<Creeper> {

    public CreeperMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Creeper creeper) {
        return super.buildDefault(creeper).map(marker -> {
            Icon icon;
            if (creeper.isPowered()) {
                icon = Icon.CHARGED_CREEPER;
            } else {
                icon = Icon.CREEPER;
            }
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.creeper", true);
    }
}
