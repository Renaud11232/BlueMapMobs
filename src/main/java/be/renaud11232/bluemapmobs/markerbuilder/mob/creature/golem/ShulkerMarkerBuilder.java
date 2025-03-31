package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Shulker;

public class ShulkerMarkerBuilder extends MobEntityMarkerBuilder<Shulker> {
    public ShulkerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SHULKER;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SHULKER;
    }
}
