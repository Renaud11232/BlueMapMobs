package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;

import java.util.Optional;

public class LlamaMarkerBuilder extends MobEntityMarkerBuilder<Llama> {
    public LlamaMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(TraderLlama.class, new TraderLlamaMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Llama mob) {
        //TODO
        return super.buildDefault(mob);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.llama", true);
    }
}
