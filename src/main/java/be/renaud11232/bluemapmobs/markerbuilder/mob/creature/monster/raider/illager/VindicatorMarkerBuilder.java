package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vindicator;

import java.util.Optional;

public class VindicatorMarkerBuilder extends MobEntityMarkerBuilder<Vindicator> {

    public VindicatorMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Vindicator mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.VINDICATOR.getPath(), Icon.VINDICATOR.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.vindicator", true);
    }
}
