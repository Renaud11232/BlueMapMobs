package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.guardian;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ElderGuardian;

import java.util.Optional;

public class ElderGuardianMarkerBuilder extends MobEntityMarkerBuilder<ElderGuardian> {

    public ElderGuardianMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(ElderGuardian mob) {
        //TODO
        return super.buildDefault(mob);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.elder_guardian", true);
    }
}
