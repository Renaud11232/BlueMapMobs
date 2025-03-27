package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;

public class ElderGuardianMarkerBuilder extends MobEntityMarkerBuilder<ElderGuardian> {
    public ElderGuardianMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ELDER_GUARDIAN, MobIcon.ELDER_GUARDIAN);
    }
}
