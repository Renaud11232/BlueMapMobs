package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Salmon;

public class SalmonMarkerBuilder extends MobEntityMarkerBuilder<Salmon> {
    public SalmonMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SALMON;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SALMON;
    }
}
