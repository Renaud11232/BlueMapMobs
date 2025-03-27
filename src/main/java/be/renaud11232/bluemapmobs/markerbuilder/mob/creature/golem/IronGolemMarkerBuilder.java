package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.IronGolem;

public class IronGolemMarkerBuilder extends MobEntityMarkerBuilder<IronGolem> {
    public IronGolemMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.IRON_GOLEM, BlueMapMobsIcon.Mob.IRON_GOLEM);
    }
}
