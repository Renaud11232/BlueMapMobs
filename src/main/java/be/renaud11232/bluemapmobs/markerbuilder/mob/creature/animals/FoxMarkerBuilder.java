package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

public class FoxMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FOX, Fox::getFoxType);
        registerIcon(Fox.Type.RED, BlueMapMobsIcon.Mob.RED_FOX);
        registerIcon(Fox.Type.SNOW, BlueMapMobsIcon.Mob.SNOW_FOX);
    }
}
