package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

import java.util.Optional;

public class ParrotMarkerBuilder extends MobEntityMarkerBuilder<Parrot> {

    public ParrotMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Parrot mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.PARROT.getPath(), Icon.PARROT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.parrot", true);
    }
}
