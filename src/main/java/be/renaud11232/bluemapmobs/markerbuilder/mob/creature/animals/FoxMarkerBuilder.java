package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

public class FoxMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.FOX, Fox::getFoxType);
        registerIcon(Fox.Type.RED, MobIcon.RED_FOX);
        registerIcon(Fox.Type.SNOW, MobIcon.SNOW_FOX);
    }
}
