package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creaking;

import java.util.Optional;

public class CreakingMarkerBuilder extends MobEntityMarkerBuilder<Creaking> {

    public CreakingMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Creaking mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.CREAKING.getPath(), Icon.CREAKING.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.creaking", true);
    }
}
