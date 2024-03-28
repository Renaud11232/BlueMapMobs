package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Salmon;

import java.util.Optional;

public class SalmonMarkerBuilder extends MobEntityMarkerBuilder<Salmon> {

    public SalmonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Salmon mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SALMON.getPath(), Icon.SALMON.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.salmon", true);
    }
}
