package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Allay;

import java.util.Optional;

public class AllayMarkerBuilder extends MobEntityMarkerBuilder<Allay> {

    public AllayMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Allay mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ALLAY.getPath(), Icon.ALLAY.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.allay", true);
    }
}
