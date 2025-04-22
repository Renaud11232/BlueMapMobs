package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.List;
import java.util.Optional;

public abstract class AbstractMobMarkerBuilder<T extends Mob> extends AbstractEntityMarkerBuilder<T> {
    public AbstractMobMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T mob) {
        return super.build(mob).map(marker -> {
            Location eyeLocation = mob.getEyeLocation();
            marker.setPosition(eyeLocation.getX(), eyeLocation.getY(), eyeLocation.getZ());
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            if (mob.getName().equals("Dinnerbone") || mob.getName().equals("Grumm")) {
                marker.addStyleClasses(List.of(BlueMapMobsStyleClass.Mob.FLIP));
            }
            return marker;
        });
    }
}
