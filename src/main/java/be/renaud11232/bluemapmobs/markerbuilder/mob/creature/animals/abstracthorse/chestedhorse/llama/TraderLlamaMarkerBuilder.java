package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TraderLlama;

import java.util.Optional;

public class TraderLlamaMarkerBuilder extends MobEntityMarkerBuilder<TraderLlama> {

    public TraderLlamaMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(TraderLlama mob) {
        //TODO
        return super.buildDefault(mob);
    }
}