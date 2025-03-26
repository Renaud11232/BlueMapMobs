package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

import java.util.Optional;

public class RabbitMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.rabbit", Rabbit::getRabbitType);
        registerIcon(Rabbit.Type.GOLD, Icon.GOLD_RABBIT);
        registerIcon(Rabbit.Type.WHITE, Icon.WHITE_RABBIT);
        registerIcon(Rabbit.Type.BLACK_AND_WHITE, Icon.WHITE_SPLOTCHED_RABBIT);
        registerIcon(Rabbit.Type.BLACK, Icon.BLACK_RABBIT);
        registerIcon(Rabbit.Type.BROWN, Icon.BROWN_RABBIT);
        registerIcon(Rabbit.Type.SALT_AND_PEPPER, Icon.SALT_RABBIT);
        registerIcon(Rabbit.Type.THE_KILLER_BUNNY, Icon.CAERBANNOG_RABBIT);
    }

    @Override
    public Optional<POIMarker> buildDefault(Rabbit rabbit) {
        return super.buildDefault(rabbit).map(marker -> {
            if (rabbit.getName().equals("Toast")) {
                marker.setIcon(Icon.TOAST_RABBIT.getPath(), Icon.TOAST_RABBIT.getAnchor());
            }
            return marker;
        });
    }
}
