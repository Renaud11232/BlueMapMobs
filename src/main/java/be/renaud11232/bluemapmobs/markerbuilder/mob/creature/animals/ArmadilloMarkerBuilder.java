package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Armadillo;

import java.util.Optional;

public class ArmadilloMarkerBuilder extends MobEntityMarkerBuilder<Armadillo> {

    public ArmadilloMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Armadillo mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ARMADILLO.getPath(), Icon.ARMADILLO.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.armadillo", true);
    }
}
