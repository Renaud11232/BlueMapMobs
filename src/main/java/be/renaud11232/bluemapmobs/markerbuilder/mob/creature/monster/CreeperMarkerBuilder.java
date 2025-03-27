package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

public class CreeperMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CREEPER, Creeper::isPowered);
        registerIcon(true, BlueMapMobsIcon.Mob.CHARGED_CREEPER);
        registerIcon(false, BlueMapMobsIcon.Mob.CREEPER);
    }
}
