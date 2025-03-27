package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;

public class MagmaCubeMarkerBuilder extends MobEntityMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.MAGMA_CUBE, MobIcon.MAGMA_CUBE);
    }
}
