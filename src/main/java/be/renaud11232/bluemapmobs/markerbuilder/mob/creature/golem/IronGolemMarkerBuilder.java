package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.IronGolem;

import java.util.Optional;

public class IronGolemMarkerBuilder extends MobEntityMarkerBuilder<IronGolem> {

    public IronGolemMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(IronGolem mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.IRON_GOLEM.getPath(), Icon.IRON_GOLEM.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.iron_golem", true);
    }
}
