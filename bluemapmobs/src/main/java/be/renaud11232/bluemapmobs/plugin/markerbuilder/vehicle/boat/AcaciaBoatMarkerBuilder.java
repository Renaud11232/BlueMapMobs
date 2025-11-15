package be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaBoat;

public class AcaciaBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<AcaciaBoat> {
    public AcaciaBoatMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.ACACIA_BOAT;
    }
}
