package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Salmon;

public class SalmonMarkerBuilder extends MobEntityMarkerBuilder<Salmon> {
    public SalmonMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SALMON, BlueMapMobsIcon.Mob.SALMON);
    }
}
