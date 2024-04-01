package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

import java.util.Optional;

public class RabbitMarkerBuilder extends MobEntityMarkerBuilder<Rabbit> {

    public RabbitMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Rabbit rabbit) {
        return super.buildDefault(rabbit).map(marker -> {
            Icon icon = rabbit.getName().equals("Toast") ? Icon.TOAST_RABBIT : switch (rabbit.getRabbitType()) {
                case GOLD -> Icon.GOLD_RABBIT;
                case WHITE -> Icon.WHITE_RABBIT;
                case BLACK_AND_WHITE -> Icon.WHITE_SPLOTCHED_RABBIT;
                case BLACK -> Icon.BLACK_RABBIT;
                case BROWN -> Icon.BROWN_RABBIT;
                case SALT_AND_PEPPER -> Icon.SALT_RABBIT;
                case THE_KILLER_BUNNY -> Icon.CAERBANNOG_RABBIT;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.rabbit", true);
    }
}
