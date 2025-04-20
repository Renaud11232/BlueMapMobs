package be.renaud11232.bluemapmobs.markerbuilder.impl.mob;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EnderDragon;

public class EnderDragonMarkerBuilder extends MobEntityMarkerBuilder<EnderDragon> {
    public EnderDragonMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ENDER_DRAGON;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.ENDER_DRAGON;
    }
}
