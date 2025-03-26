package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PufferFish;

public class PufferFishMarkerBuilder extends SingleIconMobEntityMarkerBuilder<PufferFish> {
    public PufferFishMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.puffer_fish", Icon.PUFFER_FISH);
    }
}
