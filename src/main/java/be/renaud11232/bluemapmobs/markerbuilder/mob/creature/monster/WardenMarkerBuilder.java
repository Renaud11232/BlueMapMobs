package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Warden;

public class WardenMarkerBuilder extends MobEntityMarkerBuilder<Warden> {
    public WardenMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WARDEN, BlueMapMobsIcon.Mob.WARDEN);
    }
}
