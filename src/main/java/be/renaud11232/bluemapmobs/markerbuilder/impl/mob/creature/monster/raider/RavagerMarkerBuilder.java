package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ravager;

public class RavagerMarkerBuilder extends MobEntityMarkerBuilder<Ravager> {
    public RavagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.RAVAGER;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.RAVAGER;
    }
}
