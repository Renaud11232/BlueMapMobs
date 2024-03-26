package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Donkey;

import java.util.Optional;

public class DonkeyMarkerBuilder extends MobEntityMarkerBuilder<Donkey> {

    public DonkeyMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Donkey mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
