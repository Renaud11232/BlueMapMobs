package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

public class CreeperMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.CREEPER, Creeper::isPowered);
        registerIcon(true, MobIcon.CHARGED_CREEPER);
        registerIcon(false, MobIcon.CREEPER);
    }
}
