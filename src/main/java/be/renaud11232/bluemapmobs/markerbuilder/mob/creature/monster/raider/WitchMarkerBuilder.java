package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Witch;

public class WitchMarkerBuilder extends MobEntityMarkerBuilder<Witch> {
    public WitchMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WITCH;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.WITCH;
    }
}
