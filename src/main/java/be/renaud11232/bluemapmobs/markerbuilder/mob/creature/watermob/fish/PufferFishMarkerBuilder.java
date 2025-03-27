package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PufferFish;

public class PufferFishMarkerBuilder extends MobEntityMarkerBuilder<PufferFish> {
    public PufferFishMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PUFFER_FISH, BlueMapMobsIcon.Mob.PUFFER_FISH);
    }
}
