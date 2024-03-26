package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian.ElderGuardianMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.Guardian;

import java.util.Optional;

public class GuardianMarkerBuilder extends MobEntityMarkerBuilder<Guardian> {
    public GuardianMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(ElderGuardian.class, new ElderGuardianMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Guardian mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
