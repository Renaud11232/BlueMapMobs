package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

import java.util.Optional;

public class RabbitMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.RABBIT, Rabbit::getRabbitType);
        registerIcon(Rabbit.Type.GOLD, BlueMapMobsIcon.Mob.GOLD_RABBIT);
        registerIcon(Rabbit.Type.WHITE, BlueMapMobsIcon.Mob.WHITE_RABBIT);
        registerIcon(Rabbit.Type.BLACK_AND_WHITE, BlueMapMobsIcon.Mob.WHITE_SPLOTCHED_RABBIT);
        registerIcon(Rabbit.Type.BLACK, BlueMapMobsIcon.Mob.BLACK_RABBIT);
        registerIcon(Rabbit.Type.BROWN, BlueMapMobsIcon.Mob.BROWN_RABBIT);
        registerIcon(Rabbit.Type.SALT_AND_PEPPER, BlueMapMobsIcon.Mob.SALT_RABBIT);
        registerIcon(Rabbit.Type.THE_KILLER_BUNNY, BlueMapMobsIcon.Mob.CAERBANNOG_RABBIT);
    }

    @Override
    public Optional<POIMarker> buildDefault(Rabbit rabbit) {
        return super.buildDefault(rabbit).map(marker -> {
            if (rabbit.getName().equals("Toast")) {
                marker.setIcon(BlueMapMobsIcon.Mob.TOAST_RABBIT.getPath(), BlueMapMobsIcon.Mob.TOAST_RABBIT.getAnchor());
            }
            return marker;
        });
    }
}
