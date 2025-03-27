package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Drowned;

public class DrownedMarkerBuilder extends MobEntityMarkerBuilder<Drowned> {
    public DrownedMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.DROWNED, BlueMapMobsIcon.Mob.DROWNED);
    }
}
