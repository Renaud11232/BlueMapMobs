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
    public Optional<POIMarker> buildDefault(Creeper mob) {
        return super.buildDefault(mob).map(marker -> {
            //TODO big creeper
            marker.setIcon(Icon.CREEPER.getPath(), Icon.CREEPER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.creeper", true);
    }
}
