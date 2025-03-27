package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

public class SnowmanMarkerBuilder extends MobEntityMarkerBuilder<Snowman> {
    public SnowmanMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SNOWMAN, BlueMapMobsIcon.Mob.SNOWMAN);
    }
}
