package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;

import java.util.Optional;

public class MagmaCubeMarkerBuilder extends MobEntityMarkerBuilder<MagmaCube> {

    public MagmaCubeMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(MagmaCube mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.MAGMA_CUBE.getPath(), Icon.MAGMA_CUBE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.magma_cube", true);
    }
}
