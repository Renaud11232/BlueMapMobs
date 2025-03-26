package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;

public class MagmaCubeMarkerBuilder extends SingleIconMobEntityMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.magma_cube", Icon.MAGMA_CUBE);
    }
}
