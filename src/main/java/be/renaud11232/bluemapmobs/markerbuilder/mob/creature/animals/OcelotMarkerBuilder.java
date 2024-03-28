package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ocelot;

import java.util.Optional;

public class OcelotMarkerBuilder extends MobEntityMarkerBuilder<Ocelot> {

    public OcelotMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Ocelot mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.OCELOT.getPath(), Icon.OCELOT.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.ocelot", true);
    }
}
