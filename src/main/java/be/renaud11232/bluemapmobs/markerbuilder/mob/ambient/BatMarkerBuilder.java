package be.renaud11232.bluemapmobs.markerbuilder.mob.ambient;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bat;

public class BatMarkerBuilder extends MobEntityMarkerBuilder<Bat> {
    public BatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.BAT, BlueMapMobsIcon.Mob.BAT);
    }
}
