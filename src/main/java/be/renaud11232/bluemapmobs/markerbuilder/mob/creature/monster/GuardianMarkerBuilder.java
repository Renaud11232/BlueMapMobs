package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian.ElderGuardianMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.Guardian;

public class GuardianMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Guardian> {
    public GuardianMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.guardian", Icon.GUARDIAN);
        registerMarkerBuilder(ElderGuardian.class, new ElderGuardianMarkerBuilder(config));
    }
}
