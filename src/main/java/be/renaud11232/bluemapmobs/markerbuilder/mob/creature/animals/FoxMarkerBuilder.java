package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

public class FoxMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.fox", Fox::getFoxType);
        registerIcon(Fox.Type.RED, Icon.RED_FOX);
        registerIcon(Fox.Type.SNOW, Icon.SNOW_FOX);
    }
}
