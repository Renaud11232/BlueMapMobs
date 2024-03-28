package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Drowned;

import java.util.Optional;

public class DrownedMarkerBuilder extends MobEntityMarkerBuilder<Drowned> {

    public DrownedMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Drowned mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.DROWNED.getPath(), Icon.DROWNED.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.drowned", true);
    }
}
