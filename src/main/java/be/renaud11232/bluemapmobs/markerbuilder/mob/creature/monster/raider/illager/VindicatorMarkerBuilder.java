package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vindicator;

public class VindicatorMarkerBuilder extends MobEntityMarkerBuilder<Vindicator> {
    public VindicatorMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.VINDICATOR, BlueMapMobsIcon.Mob.VINDICATOR);
    }
}
