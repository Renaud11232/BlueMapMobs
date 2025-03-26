package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

public class CreeperMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.creeper", Creeper::isPowered);
        registerIcon(true, Icon.CHARGED_CREEPER);
        registerIcon(false, Icon.CREEPER);
    }
}
