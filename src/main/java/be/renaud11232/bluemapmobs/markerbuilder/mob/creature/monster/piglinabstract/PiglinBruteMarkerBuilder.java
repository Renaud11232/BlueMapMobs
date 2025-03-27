package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PiglinBrute;

public class PiglinBruteMarkerBuilder extends MobEntityMarkerBuilder<PiglinBrute> {
    public PiglinBruteMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PIGLIN_BRUTE, MobIcon.PIGLIN_BRUTE);
    }
}
