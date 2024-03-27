package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.Icon;
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
    public Optional<POIMarker> buildDefault(Llama llama) {
        //TODO Add all Llama carpet colors ?
        return super.buildDefault(llama).map(marker -> {
            Icon icon = switch (llama.getColor()) {
                case GRAY -> Icon.GRAY_LLAMA;
                case BROWN -> Icon.BROWN_LLAMA;
                case CREAMY -> Icon.CREAMY_LLAMA;
                case WHITE -> Icon.WHITE_LLAMA;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.llama", true);
    }
}
