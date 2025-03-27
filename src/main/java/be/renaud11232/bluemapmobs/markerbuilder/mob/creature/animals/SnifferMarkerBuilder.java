package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sniffer;

public class SnifferMarkerBuilder extends MobEntityMarkerBuilder<Sniffer> {
    public SnifferMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SNIFFER, MobIcon.SNIFFER);
    }
}
