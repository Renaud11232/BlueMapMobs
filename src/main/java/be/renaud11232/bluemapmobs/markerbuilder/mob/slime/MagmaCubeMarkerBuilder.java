package be.renaud11232.bluemapmobs.markerbuilder.mob.slime;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;

public class MagmaCubeMarkerBuilder extends MobEntityMarkerBuilder<MagmaCube> {
    public MagmaCubeMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.MAGMA_CUBE, BlueMapMobsIcon.Mob.MAGMA_CUBE);
    }
}
