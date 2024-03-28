package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ravager;

import java.util.Optional;

public class RavagerMarkerBuilder extends MobEntityMarkerBuilder<Ravager> {

    public RavagerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Ravager mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.RAVAGER.getPath(), Icon.RAVAGER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.ravager", true);
    }
}
