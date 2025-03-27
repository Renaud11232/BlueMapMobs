package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pillager;

public class PillagerMarkerBuilder extends MobEntityMarkerBuilder<Pillager> {
    public PillagerMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PILLAGER, MobIcon.PILLAGER);
    }
}
