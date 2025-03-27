package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;

public class EvokerMarkerBuilder extends MobEntityMarkerBuilder<Evoker> {
    public EvokerMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.EVOKER, MobIcon.EVOKER);
    }
}
