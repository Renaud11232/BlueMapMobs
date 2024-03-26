package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

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
        //TODO
        return super.buildDefault(mob);
    }
}
