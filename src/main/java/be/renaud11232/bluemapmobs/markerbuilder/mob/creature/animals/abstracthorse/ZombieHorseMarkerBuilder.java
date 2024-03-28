package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ZombieHorse;

import java.util.Optional;

public class ZombieHorseMarkerBuilder extends MobEntityMarkerBuilder<ZombieHorse> {

    public ZombieHorseMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(ZombieHorse mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ZOMBIE_HORSE.getPath(), Icon.ZOMBIE_HORSE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.zombie_horse", true);
    }
}
