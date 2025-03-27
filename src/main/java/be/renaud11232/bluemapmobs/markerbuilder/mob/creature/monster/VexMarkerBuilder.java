package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vex;

public class VexMarkerBuilder extends MobEntityMarkerBuilder<Vex> {
    public VexMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.VEX, MobIcon.VEX);
    }
}
