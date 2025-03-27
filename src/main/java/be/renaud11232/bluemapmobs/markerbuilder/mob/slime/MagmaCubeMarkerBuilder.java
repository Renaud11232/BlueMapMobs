package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;

public class MagmaCubeMarkerBuilder extends MobEntityMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.MAGMA_CUBE, MobIcon.MAGMA_CUBE);
    }
}
