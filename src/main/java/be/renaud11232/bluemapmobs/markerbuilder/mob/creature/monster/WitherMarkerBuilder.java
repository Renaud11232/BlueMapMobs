package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wither;

public class WitherMarkerBuilder extends MobEntityMarkerBuilder<Wither> {
    public WitherMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.WITHER, MobIcon.WITHER);
    }
}
