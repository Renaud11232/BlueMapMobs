package be.renaud11232.bluemapmobs.markerbuilder.mob.flying;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Phantom;

public class PhantomMarkerBuilder extends MobEntityMarkerBuilder<Phantom> {
    public PhantomMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PHANTOM, MobIcon.PHANTOM);
    }
}
