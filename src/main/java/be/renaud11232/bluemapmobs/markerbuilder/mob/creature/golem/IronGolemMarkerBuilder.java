package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.IronGolem;

public class IronGolemMarkerBuilder extends MobEntityMarkerBuilder<IronGolem> {
    public IronGolemMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.IRON_GOLEM, MobIcon.IRON_GOLEM);
    }
}
