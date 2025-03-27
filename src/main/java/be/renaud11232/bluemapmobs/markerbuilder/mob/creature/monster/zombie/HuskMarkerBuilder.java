package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Husk;

public class HuskMarkerBuilder extends MobEntityMarkerBuilder<Husk> {
    public HuskMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.HUSK, BlueMapMobsIcon.Mob.HUSK);
    }
}
