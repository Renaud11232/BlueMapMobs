package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

import java.util.Optional;

public class RabbitMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.RABBIT, Rabbit::getRabbitType);
        registerIcon(Rabbit.Type.GOLD, MobIcon.GOLD_RABBIT);
        registerIcon(Rabbit.Type.WHITE, MobIcon.WHITE_RABBIT);
        registerIcon(Rabbit.Type.BLACK_AND_WHITE, MobIcon.WHITE_SPLOTCHED_RABBIT);
        registerIcon(Rabbit.Type.BLACK, MobIcon.BLACK_RABBIT);
        registerIcon(Rabbit.Type.BROWN, MobIcon.BROWN_RABBIT);
        registerIcon(Rabbit.Type.SALT_AND_PEPPER, MobIcon.SALT_RABBIT);
        registerIcon(Rabbit.Type.THE_KILLER_BUNNY, MobIcon.CAERBANNOG_RABBIT);
    }

    @Override
    public Optional<POIMarker> buildDefault(Rabbit rabbit) {
        return super.buildDefault(rabbit).map(marker -> {
            if (rabbit.getName().equals("Toast")) {
                marker.setIcon(MobIcon.TOAST_RABBIT.getPath(), MobIcon.TOAST_RABBIT.getAnchor());
            }
            return marker;
        });
    }
}
