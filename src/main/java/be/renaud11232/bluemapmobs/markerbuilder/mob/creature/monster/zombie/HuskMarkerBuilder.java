package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Husk;

public class HuskMarkerBuilder extends MobEntityMarkerBuilder<Husk> {
    public HuskMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.HUSK, MobIcon.HUSK);
    }
}
