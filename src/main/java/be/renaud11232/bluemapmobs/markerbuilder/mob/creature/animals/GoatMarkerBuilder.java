package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Goat;

public class GoatMarkerBuilder extends MobEntityMarkerBuilder<Goat> {
    public GoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.GOAT, BlueMapMobsIcon.Mob.GOAT);
    }
}
