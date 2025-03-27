package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PufferFish;

public class PufferFishMarkerBuilder extends MobEntityMarkerBuilder<PufferFish> {
    public PufferFishMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.PUFFER_FISH, MobIcon.PUFFER_FISH);
    }
}
