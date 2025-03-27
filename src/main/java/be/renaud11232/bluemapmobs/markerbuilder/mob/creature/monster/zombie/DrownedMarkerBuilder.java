package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Drowned;

public class DrownedMarkerBuilder extends MobEntityMarkerBuilder<Drowned> {
    public DrownedMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.DROWNED, MobIcon.DROWNED);
    }
}
