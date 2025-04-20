package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ZombieHorse;

public class ZombieHorseMarkerBuilder extends MobEntityMarkerBuilder<ZombieHorse> {
    public ZombieHorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE_HORSE;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.ZOMBIE_HORSE;
    }
}
