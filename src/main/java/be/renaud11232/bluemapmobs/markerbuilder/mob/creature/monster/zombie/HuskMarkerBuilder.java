package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Husk;

import java.util.Optional;

public class HuskMarkerBuilder extends MobEntityMarkerBuilder<Husk> {

    public HuskMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Husk mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.HUSK.getPath(), Icon.HUSK.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.husk", true);
    }
}
