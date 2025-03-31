package be.renaud11232.bluemapmobs.markerbuilder.mob.flying;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Phantom;

public class PhantomMarkerBuilder extends MobEntityMarkerBuilder<Phantom> {
    public PhantomMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PHANTOM;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.PHANTOM;
    }
}
