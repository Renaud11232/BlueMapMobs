package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ravager;

public class RavagerMarkerBuilder extends MobEntityMarkerBuilder<Ravager> {
    public RavagerMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.RAVAGER, BlueMapMobsIcon.Mob.RAVAGER);
    }
}
