package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian.ElderGuardianMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.Guardian;

public class GuardianMarkerBuilder extends MobEntityMarkerBuilder<Guardian> {
    public GuardianMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.GUARDIAN, MobIcon.GUARDIAN);
        registerMarkerBuilder(ElderGuardian.class, new ElderGuardianMarkerBuilder(config));
    }
}
