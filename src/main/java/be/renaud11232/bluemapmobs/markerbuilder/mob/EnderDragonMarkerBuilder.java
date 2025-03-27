package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EnderDragon;

public class EnderDragonMarkerBuilder extends MobEntityMarkerBuilder<EnderDragon> {
    public EnderDragonMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ENDER_DRAGON, MobIcon.ENDER_DRAGON);
    }
}
