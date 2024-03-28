package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Zoglin;

import java.util.Optional;

public class ZoglinMarkerBuilder extends MobEntityMarkerBuilder<Zoglin> {

    public ZoglinMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Zoglin mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ZOGLIN.getPath(), Icon.ZOGLIN.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.zoglin", true);
    }
}
