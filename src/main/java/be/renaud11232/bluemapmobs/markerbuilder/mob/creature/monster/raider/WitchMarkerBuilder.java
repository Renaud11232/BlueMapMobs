package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Witch;

import java.util.Optional;

public class WitchMarkerBuilder extends MobEntityMarkerBuilder<Witch> {

    public WitchMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Witch mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
