package be.renaud11232.bluemapmobs.markerbuilder.mob.ambient;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bat;

import java.util.Optional;

public class BatMarkerBuilder extends MobEntityMarkerBuilder<Bat> {

    public BatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Bat mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.BAT.getPath(), Icon.BAT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.bat", true);
    }
}
