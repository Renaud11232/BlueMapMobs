package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cod;

public class CodMarkerBuilder extends MobEntityMarkerBuilder<Cod> {
    public CodMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COD, BlueMapMobsIcon.Mob.COD);
    }
}
