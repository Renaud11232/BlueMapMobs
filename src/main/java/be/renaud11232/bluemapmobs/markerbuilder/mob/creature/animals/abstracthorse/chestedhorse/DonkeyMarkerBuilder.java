package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Donkey;

public class DonkeyMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Donkey> {
    public DonkeyMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.donkey", Icon.DONKEY);
    }
}
